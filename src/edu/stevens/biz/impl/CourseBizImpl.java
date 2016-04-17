package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.CourseBiz;
import edu.stevens.biz.CustomBiz;
import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.dao.IndividualrateDao;
import edu.stevens.dao.UserDao;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Individualrate;
import edu.stevens.entity.User;

@Service("courseBiz")
@Transactional(readOnly = false)
public class CourseBizImpl implements CourseBiz{

	@Autowired
	@Qualifier("courseDao")
	private CourseDao courseDao;
	
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	@Autowired
	@Qualifier("individualrateDao")
	private IndividualrateDao individualrateDao;
	
	public IndividualrateDao getIndividualrateDao() {
		return individualrateDao;
	}
	public void setIndividualrateDao(IndividualrateDao individualrateDao) {
		this.individualrateDao = individualrateDao;
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public CourseDao getCourseDao() {
		return courseDao;
	}
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	public ArrayList findAll() {
		return courseDao.findAll();
	}
	public Course findById(int id) {
		return courseDao.findById(id);
	}
	public boolean update(Course course) {

		return courseDao.update(course);
	}
	public boolean delete(Course course) {

		return courseDao.delete(course);
	}
	public boolean insert(Course course) {
		// TODO Auto-generated method stub
		return courseDao.insert(course);
	}
	public ArrayList findTeahcerId(int id) {
		return courseDao.findTeahcerId(id);
	}
	/**
	 * Collaborative Filtering
	 * @author: Xuan Li
	 * @date 04/12/2016
	 * @author 璇
	 * @return ArrayList
	 * @description: 
	 * 				User who had similar tastes in the past, will have similar tastes in the future
	 * 				We need calculate similar between login user and other user in database
	 */
	public ArrayList<Course> recommend(Course course, User user) {
		// ave score for currentUser calculate for future using
		double aveA = 0;
		ArrayList<Individualrate> aveAs = individualrateDao.findByUserId(user.getUserId());
		double sumA = 0;
		double numA = 0;
		for (int i = 0; i < aveAs.size(); i++) {
			sumA += aveAs.get(i).getFinalGrades();
			numA++;
		}
		aveA = sumA/numA;
		
		
		//System.out.println(course+" "+user);
		ArrayList<Course> list = new ArrayList<Course>();
		if(null==user){
			list.add(course);
			list.add(course);
			list.add(course);
		}else{
		// first we can call a function to get the similarity of every user to currentLogin user
		Map<Integer,String>  uList = new HashMap<Integer,String>();
		uList = getSimilarUser(user);
		 // we assume a variable to store every course and it score(if this dones't exist, we need to predict the score)
		 Map<Integer,String> courseMap = new HashMap<Integer,String>();
		 
		 //calculate score for all courses
		 ArrayList<Course> courseList = courseDao.findAll();
		 for (int i = 0; i < courseList.size(); i++) {
			Course c = courseList.get(i);
			if(c.getCourseId()==course.getCourseId()){
				continue;
			}
			Individualrate individula = individualrateDao.findByUserIdAndCourseId(user.getUserId(), c.getCourseId());
			// if the user have not give score for this course, we do the predict
			if(individula==null){
				double part1 = 0;
				double part2 = 0;
				System.out.println(c.getCourseId());
				ArrayList<Individualrate> indiList = individualrateDao.findByCourseId(c.getCourseId());
				for (int j = 0; j < indiList.size(); j++) {
					Individualrate ins = indiList.get(j);
					User ins_user = userDao.findById(ins.getUserId());
					String sim_aveB= uList.get(ins_user.getUserId());
					
					double simAB = Double.parseDouble(sim_aveB.split(";")[0]);
					double aveB = Double.parseDouble(sim_aveB.split(";")[1]);
					part1 += simAB*(ins.getFinalGrades()-aveB);
					part2 += simAB;
					

					System.out.println( simAB*(ins.getFinalGrades()-aveB));
					System.out.println( simAB);
					
				}		
				double score = aveA+ part1/part2;
				courseMap.put(c.getCourseId(), score+"");
			}else{
			// if the user have give the score for this course, we don't need calculate
				courseMap.put(c.getCourseId(), individula.getFinalGrades()+"");
			}

		}
		 for (Entry<Integer, String> entry : courseMap.entrySet()) {
			   System.out.println("key= " + courseDao.findById(entry.getKey()).getName() + " and value= " + entry.getValue());
			  }
		 
		}
		return list;
		
		
		
		
		
		
		
	}
	
	
	
	
	private  Map<Integer,String> getSimilarUser(User user) {
		double aveA = 0;
		double aveB = 0;
		
		// we define object returnList as a map to store returnValue
		Map<Integer,String> returnList = new HashMap<Integer,String>();
		
		
		//firtly we need calculate the ave score for currentUser
		ArrayList<Individualrate> aveAs = individualrateDao.findByUserId(user.getUserId());
		double sumA = 0;
		double numA = 0;
		for (int i = 0; i < aveAs.size(); i++) {
			sumA += aveAs.get(i).getFinalGrades();
			numA++;
		}
		aveA = sumA/numA;
		// the aveA is the ave score for current score
		
		
		// then we need calculate aveScore for other user in database
		ArrayList<User> list = userDao.findAll();
		
		// get each user
		for (int i = 0; i < list.size(); i++) {
			User u = list.get(i);
			
			// if this user is equal currentUser, then we skip this user
			if(u.equals(user)||u==user){
				continue;
			}
			
			//calculate aveB for this user 
			
			ArrayList<Individualrate> indiRates = individualrateDao.findByUserId(u.getUserId());
			double sumB = 0;
			double numB= 0;
	
			if(indiRates==null){continue;}
			for (int j = 0; j < indiRates.size(); j++) {
				sumB += indiRates.get(j).getFinalGrades();
				numB++;
			}
			aveB = sumB/numB;
			// now we have ave score for B
			//System.out.println(u.getUserName()+" "+aveB+" "+ aveA);
			// we can calculate sim
			double sim = 0;
			
			double part1 = 0;

			double part2 = 0;

			double part3 = 0;
			
			//ArrayList<Individualrate> individualratesForCurrentUser = individualrateDao.findByUserId(u.getUserId());
			ArrayList<Course> courseList = courseDao.findAll();
			for (int j = 0; j < courseList.size(); j++) {
				Course c = courseList.get(j);
				Individualrate individualrate1  = individualrateDao.findByUserIdAndCourseId(user.getUserId(), c.getCourseId());
				Individualrate individualrate2  = individualrateDao.findByUserIdAndCourseId(u.getUserId(), c.getCourseId()); 
				double rateAP = aveA;
				double rateBP = aveB;
				// if individualrateFor this course and this user doesn't exist, we can assume that the rate is equal ave score
				if(individualrate1 !=null){
					rateAP = individualrate1.getFinalGrades();
					//System.out.println("individualrate1 exist"+rateAP);
				}
				if(individualrate2 !=null){
					rateBP = individualrate2.getFinalGrades();

					//System.out.println("individualrate2 exist"+rateBP);
				}
			//	System.out.println(rateAP+" "+ rateBP);
				// the most important part for equation
				///if(u.getUserId()==2){
					///System.out.println((rateAP-aveA)*(rateBP-aveB)+" 爱上大声大声道");
					///System.out.println((rateAP-aveA)+" 33333333333");
				//	///System.out.println((rateBP-aveB)+" 44444444444444");
				//}
				part1 += (rateAP-aveA)*(rateBP-aveB);
				
				part2 += (rateAP-aveA)* (rateAP-aveA);
				
				part3 += (rateBP-aveB)*(rateBP-aveB);
				
				//System.out.println("/////////////////////");
				//System.out.println(part1+" " + part2+" " + part3);
			}
			// we can calculate the final sim for user and u ;
			sim = part1/(Math.sqrt(part2)*Math.sqrt(part3));
			
			
			
			
			returnList.put(u.getUserId(),sim+";"+aveB);
			
		}
		
		return returnList;
	}




}
