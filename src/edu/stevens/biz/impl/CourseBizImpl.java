package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.chain.web.MapEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.CourseBiz;
import edu.stevens.biz.CustomBiz;
import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.dao.IndividualrateDao;
import edu.stevens.dao.SumrateDao;
import edu.stevens.dao.UserDao;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Individualrate;
import edu.stevens.entity.Recommend;
import edu.stevens.entity.Sumrate;
import edu.stevens.entity.User;
import edu.stevens.entity.knowledgeScore;

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
	
	
	@Autowired
	@Qualifier("sumrateDao")
	private SumrateDao sumrateDao;
	
	
	
	public SumrateDao getSumrateDao() {
		return sumrateDao;
	}
	public void setSumrateDao(SumrateDao sumrateDao) {
		this.sumrateDao = sumrateDao;
	}
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
	 * @return ArrayList
	 * @description: 
	 * 				User who had similar tastes in the past, will have similar tastes in the future
	 * 				We need calculate similar between login user and other user in database
	 */
	public ArrayList<Course> recommendUsingCollbaritive(Course course, User user) {
		// ave score for currentUser calculate for future using
		HashMap<Integer,Double> courseMap = new HashMap<Integer,Double>();
		double aveA = 0;
		ArrayList<Individualrate> aveAs = individualrateDao.findByUserId(user.getUserId());
		double sumA = 0;
		double numA = 0;
		for (int i = 0; i < aveAs.size(); i++) {
			sumA += aveAs.get(i).getFinalGrades();
			numA++;
		}
		aveA = sumA/numA;
		
		
		ArrayList<Course> list = new ArrayList<Course>();
		if(null==user){
			list.add(course);
			list.add(course);
			list.add(course);
		}else{
		// first we can call a function to get the similarity of every user to currentLogin user
		Map<Integer,String>  uList = new HashMap<Integer,String>();
		uList = getSimilarUser(user);
		Iterator<Map.Entry<Integer, String>> iterator = uList.entrySet().iterator();  
        while (iterator.hasNext()) {  
            Map.Entry<Integer, String> entry = iterator.next();  
              
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());  
        }  
		 // we assume a variable to store every course and it score(if this dones't exist, we need to predict the score)
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
				ArrayList<Individualrate> indiList = individualrateDao.findByCourseId(c.getCourseId());
				for (int j = 0; j < indiList.size(); j++) {
					Individualrate ins = indiList.get(j);
					User ins_user = userDao.findById(ins.getUserId());
					String sim_aveB= uList.get(ins_user.getUserId());
					
					double simAB = Double.parseDouble(sim_aveB.split(";")[0]);
					double aveB = Double.parseDouble(sim_aveB.split(";")[1]);
					part1 += simAB*(ins.getFinalGrades()-aveB);
					part2 += Math.abs(simAB);
					
					
				}		
				double score = aveA+ part1/part2;
				courseMap.put(c.getCourseId(), score);
			}else{
			// if the user have give the score for this course, we don't need calculate
				courseMap.put(c.getCourseId(), individula.getFinalGrades()+0.0);
			}

		} 
		}
		// sorting
		List<Map.Entry<Integer, Double>> infoIds =new ArrayList<Map.Entry<Integer, Double>>(courseMap.entrySet());
		for (int i = 0; i < infoIds.size(); i++) {
			if(infoIds.get(i).getValue().isNaN()){
				infoIds.remove(i);
				i--;
			}
		}
		Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Double>>() {   
		   public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {  
			   if(o2.getValue()!=null&&o1.getValue()!=null&&o2.getValue().compareTo(o1.getValue())>0){  
		            return 1;  
		           }else{  
		            return -1; 
		           }
			   }
		}); 
	
		for (int i = 0; i < 3&&i<infoIds.size(); i++) {
			list.add(courseDao.findById(infoIds.get(i).getKey()));
		}
		
		return list;
		
	}
	
	private  Map<Integer,String> getSimilarUser(User user) {
		double aveA = 0;
		double aveB = 0;
		
		// we define object returnList as a map to store returnValue
		Map<Integer,String> returnList = new HashMap<Integer,String>();
		
		
		//firstly we need calculate the ave score for currentUser
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
			// we can calculate sim
			double sim = 0;
			
			double part1 = 0;

			double part2 = 0;

			double part3 = 0;
			
			// iterate each course for this user and calculate the similarity
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
				}
				if(individualrate2 !=null){
					rateBP = individualrate2.getFinalGrades();

				}
				part1 += (rateAP-aveA)*(rateBP-aveB);
				
				part2 += (rateAP-aveA)* (rateAP-aveA);
				
				part3 += (rateBP-aveB)*(rateBP-aveB);
				


				//System.out.println(part1+" " + part2+" " + part3);
			}
			// we can calculate the final sim for user and u ;
			sim = part1/(Math.sqrt(part2)*Math.sqrt(part3));
			
			returnList.put(u.getUserId(),sim+";"+aveB);
			
		}
		
		return returnList;
	}


	/**
	 * Knowledge-based Recommendation
	 * @author: Xuan Li
	 * @date: 04/10/2016
	 * @return: ArrayList
	 * @description: 
	 * 				Knowledge-based:"Tell me what fits based on my needs."
	 */
	public ArrayList<Course> recommendUsingKnowledgeBased(Recommend recommend) {
		
		
		//Create a ArrayList to store the recommended courses
		ArrayList<Course> list = new ArrayList<Course>();
		
		//Find all Sumrate record
		ArrayList<Sumrate> sumrateList = sumrateDao.findAll();
		
		//Create a knowledgeScoreList objedt to store the score to each course
		ArrayList<knowledgeScore> knowledgeScoreList = new ArrayList<knowledgeScore>();
		
		//Get the users' choices form action level
		int difficulty = recommend.getDifficulty();//get the difficulty from web
		int recommendation = recommend.getRecommendation();//get the recommendation from web
		int practicability = recommend.getPracticability();//get the practicability from web
		ArrayList<String> focusArea = recommend.getFocusArea();//get the focusArea from web
		
		//Set appropriate weight for each parameter
		double[] weight = {0.25, 0.25, 0.25, 0.25};
		

		
		for(int i = 0; i < sumrateList.size(); i++){
			//Get a sumrate record form sumrateList according to the index 
			Sumrate sumrate = sumrateList.get(i);
			
			//Calculate the value of mathematical parameters using Decreasing Algorithms
			double diff = 1 - 0.2 * Math.abs(difficulty - sumrate.getDifficulty());
			double recomm = 1 - 0.2 * Math.abs(recommendation - sumrate.getRecommendation());
			double pract = 1 - 0.2 * Math.abs(practicability - sumrate.getPracticability());
			
			//Initiate the keyword from "Course" in database for splitting and counting
			String keywords = "";
			String[] keywordsplit = {};
			int keywordsum = 0;
            //Find the keywords of specific course by course ID
			Course currentCourse = courseDao.findById(sumrate.getCourseId());
			keywords = currentCourse.getKeywords();
			keywordsplit = keywords.split(",");//Split the keywords
			keywordsum = keywordsplit.length;//Get the length of keywords
			
			//Initiate the parameters to calculate similarity
			double similarity = 0;
			double intersection = 0;
			
			//Compare every keyword in the current course with every focusArea in the user
			for (int j=0; j<keywordsum; j++) {
				for (int k=0; k < focusArea.size(); k++) {
					if (keywordsplit[j].equalsIgnoreCase(focusArea.get(k))) {
						intersection++;//Record the intersection value
					}
				}
			}
			//Calculate the similarity by the formula
			similarity = 2 * intersection / (focusArea.size() + keywordsum);
			
			//Calculate the total of all parameters using Weights Product Algorithms
			double totalScore = weight[0] * diff + weight[1] * recomm + weight[2] * pract + weight[3] * similarity;
			
			//Add new record to knowledgeScore and build the knowledgeSore ArrayList in system
			knowledgeScore ks = new knowledgeScore(sumrate.getCourseId(), diff, recomm, pract, similarity, totalScore);
			knowledgeScoreList.add(ks);	
		}
		
		//Bubble Sorting for have the sorting data according to total score
		for(int j = 0; j < knowledgeScoreList.size(); j++){
			for(int k = j + 1; k < knowledgeScoreList.size() - j - 1; k++){
				if(knowledgeScoreList.get(j).getTotalScore() < knowledgeScoreList.get(k).getTotalScore()){
					knowledgeScore temp = knowledgeScoreList.get(j);
					knowledgeScoreList.set(j, knowledgeScoreList.get(k));
					knowledgeScoreList.set(k, temp);
				}	
			}
		}
		
		//Add the first three highest score courses to recommended courses list
		for(int i = 0; i < 3 && i < knowledgeScoreList.size(); i++){
			list.add(courseDao.findById(knowledgeScoreList.get(i).getCourseId()));
		}
		
		return list;
	}	
	
	/**
	 * Content-Based Recommendation PartI
	 * @author: Xuan Li
	 * @date 07/01/2016
	 * @return ArrayList
	 * @description: 
	 * When a user logins, we will compare this course with other courses according to his/her interests.				
	 * According to the keyword similarity algorithm calculation, we will list the top three highest score courses as recommendation to the user.				
	 */
	public ArrayList<Course> recommendUsingContentBased1(User user) {
		//After adding the ranked top three Courses, return list object
		ArrayList<Course> list = new ArrayList();  
		//Acquiring all the course objects in the courseDao layer
		ArrayList<Course> courseList = courseDao.findAll();   
		//Acquiring the interest string of the current user
		String interest = user.getIntrests();    
		//split the interest string with comma into a String array
		String[] interestsplit = interest.split(",");  
		//Acquiring the interest word and course keyword total number
		double interestsum = interestsplit.length;
		double keywordsum = 0;
		//when user interest word equals course keyword, intersection increases
		double intersection = 0;  
		//mark the index of the top three highest score courses
		int firstflag = -1;  
		int secondflag = -1;
		int thirdflag = -1;
		double similarity = 0;
		double first = 0;
		double second = 0;
		double third = 0;
		//traversing each course 
		for (int i=0; i<courseList.size(); i++) {
			//Acquiring the current course object
			Course currentCourse = courseList.get(i);
			//Acquiring the keywords string of the current course
			String keywords = currentCourse.getKeywords();
			//split the course keywords string with comma into a String array
			String[] keywordsplit = keywords.split(",");
			keywordsum = keywordsplit.length;
			//traversing every keyword in the current course separated by the ","
			for (int j=0; j<keywordsum; j++) {
				//comparing every keyword in the current course with every interest word in the user
				for (int k=0; k<interestsum; k++) {
					//check if these two words equal
					if (keywordsplit[j].equalsIgnoreCase(interestsplit[k])) {
						//if equals, the intersection variable increases
						intersection++;
					}
				}
			}
			//calculate the similarity score with the argument value above
			similarity = 2 * intersection / (interestsum + keywordsum);
            //find out the top three highest score courses
			if (similarity > first) {
				first = similarity;
				firstflag = i;
			} else if (similarity > second) {
				second = similarity;
				secondflag = i;
			} else if (similarity > third) {
				third = similarity;
				thirdflag = i;
			}
			//every time after calculating the similarity, we should clear the intersection and similarity value to 0 in case of
			//overlapping
			intersection = 0;
			similarity = 0;
		}
		//Acquiring the top three highest score courses object using the mark for each of the courses
		Course topFirstCourse = courseList.get(firstflag);
		Course topSecondCourse = courseList.get(secondflag);
		Course topThirdCourse = courseList.get(thirdflag);
		//add these three courses to the list ArrayList
		list.add(topFirstCourse);
		list.add(topSecondCourse);
		list.add(topThirdCourse);
		
		return list;
	}
	/**
	 * Content-Based Recommendation PartII
	 * @author: Xuan Li
	 * @date 07/02/2016
	 * @return ArrayList
	 * @description: 
	 * When a user select one course, we will compare this course with other courses. Meanwhile, we will also refer to the user interest as weighted.			
	 * According to the keyword similarity algorithm calculation, we will list the top three highest score courses as recommendation to the user.				
	 */
	public ArrayList<Course> recommendUsingContentBased2(User user, Course course) {
		//After adding the ranked top three Courses, return list object
		ArrayList<Course> list = new ArrayList();
		//Acquiring all the course objects in the courseDao layer
		ArrayList<Course> courseList = courseDao.findAll();
		//Instantiating a hashmap to sort the courses with similarity score
		Map<Integer, Double> map = new HashMap();
		//Acquiring the interest string of the current user
		String interest = user.getIntrests();
		//Acquiring the selected course keywords string of the current user
		String selectedCourse = course.getKeywords();
		//split the interest string with comma into a String array
		String[] interestsplit = interest.split(",");
		//split the selected course keywords string with comma into a String array
		String[] selectedCoursesplit = selectedCourse.split(",");
		//Acquiring the interest word and the selected course keyword and other course keyword total number
		double interestsum = interestsplit.length;
		double selectedCoursekeywordsum = selectedCoursesplit.length;
		double otherCoursekeywordsum = 0;
		//when user interest word equals course keyword, intersection increases
		double intersection_interest = 0;
		//when the selected course keyword equals other course keyword, intersection increases
		double intersection_SelectedCourse = 0;
		double similarityTotal = 0;
		double similarity_Interest = 0;
		double similarity_SelectedCourse = 0;
		//traversing each course
		for (int i=0; i<courseList.size(); i++) {
			//check if the current course is the selected course by the user
			if(!courseList.get(i).getCourseId().equals(course.getCourseId())) {
				//If the current course is not the selected course by the user, we get the current course object
				Course currentCourse = courseList.get(i);
				//Acquiring the keywords string of the current course
				String otherCourse = currentCourse.getKeywords();
				//split the course keywords string with comma into a String array
				String[] otherCoursesplit = otherCourse.split(",");
				//Acquiring the total number of the other courses except the selected course
				otherCoursekeywordsum = otherCoursesplit.length;
				//traversing every keyword in the current course separated by the ","
				for (int j=0; j<otherCoursekeywordsum; j++) {
					//comparing every keyword in the current course with every interest word in the user
					for (int x=0; x<interestsum; x++) {
						//check if these two words equal
						if (interestsplit[x].equalsIgnoreCase(otherCoursesplit[j])) {
							//if equals, the intersection variable increases
							intersection_interest++;
						}
					}
					//comparing every keyword in the current course with every selected course keyword
					for (int y=0; y<selectedCoursekeywordsum; y++) {
						//check if these two words equal
						if (selectedCoursesplit[y].equalsIgnoreCase(otherCoursesplit[j])) {
							//if equals, the intersection variable increases
							intersection_SelectedCourse++;
						}
					}
				}
				//calculate the similarit`y score with the argument value above
				similarity_Interest = 2 * intersection_interest / (interestsum + otherCoursekeywordsum);
				similarity_SelectedCourse = 2 * intersection_SelectedCourse / (selectedCoursekeywordsum + otherCoursekeywordsum);
				similarityTotal = 0.4 * similarity_Interest + 0.6 * similarity_SelectedCourse;
                //put every course i.e. every marked index and similarity score of each course into the hashmap
				map.put(i, similarityTotal);
				//every time after calculating the similarity, we should clear the intersection and similarity value to 0 in case of
				//overlapping
				intersection_interest = 0;
				intersection_interest = 0;
				similarity_Interest = 0;
				similarity_SelectedCourse = 0;
				similarityTotal = 0;
			}
		}
		//Hashmap sorting Algorithm
		List<Map.Entry<Integer, Double>> infoIds =new ArrayList<Map.Entry<Integer, Double>>(map.entrySet());
		for (int i = 0; i < infoIds.size(); i++) {
			if(infoIds.get(i).getValue().isNaN()){
				infoIds.remove(i);
				i--;
			}
		}
		//Recall the sort method in the Collections class
		Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Double>>() {   
		   public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {  
			   if(o2.getValue()!=null&&o1.getValue()!=null&&o2.getValue().compareTo(o1.getValue())>0){  
		            return 1;  
		           }else{  
		            return -1; 
		           }
			   }
		}); 
		//After sorting according to the ranked similarity score, we add the top three course object to the list ArrayList
		for (int i = 0; i<3; i++) {
			Course topcourse = courseList.get((infoIds.get(i).getKey()));
			list.add(topcourse);
		}
		
		return list;
	}
	

}
