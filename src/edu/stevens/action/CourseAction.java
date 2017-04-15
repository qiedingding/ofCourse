package edu.stevens.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.CourseBiz;
import edu.stevens.biz.CustomBiz;
import edu.stevens.biz.SumrateBiz;
import edu.stevens.biz.TeacherBiz;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Recommend;
import edu.stevens.entity.Sumrate;
import edu.stevens.entity.Teacher;
import edu.stevens.entity.User;

@Controller("courseAction")
public class CourseAction extends ActionSupport {

	private ArrayList list;
	private ArrayList recommendList;
	private int id;
	private Sumrate sumrate;
	private Course course;
	private Teacher teacher;
	private Recommend recommend;
	@Autowired
	@Qualifier("courseBiz")
	private CourseBiz courseBiz;
	@Autowired
	@Qualifier("sumrateBiz")
	private SumrateBiz sumrateBiz;

	
	@Autowired
	@Qualifier("teacherBiz")
	private TeacherBiz teacherBiz;

	

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public TeacherBiz getTeacherBiz() {
		return teacherBiz;
	}

	public void setTeacherBiz(TeacherBiz teacherBiz) {
		this.teacherBiz = teacherBiz;
	}

	public SumrateBiz getSumrateBiz() {
		return sumrateBiz;
	}

	public void setSumrateBiz(SumrateBiz sumrateBiz) {
		this.sumrateBiz = sumrateBiz;
	}

	public Sumrate getSumrate() {
		return sumrate;
	}

	public void setSumrate(Sumrate sumrate) {
		this.sumrate = sumrate;
	}

	public Recommend getRecommend() {
		return recommend;
	}

	public void setRecommend(Recommend recommend) {
		this.recommend = recommend;
	}

	public ArrayList getRecommendList() {
		return recommendList;
	}

	public void setRecommendList(ArrayList recommendList) {
		this.recommendList = recommendList;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public CourseBiz getCourseBiz() {
		return courseBiz;
	}

	public void setCourseBiz(CourseBiz courseBiz) {
		this.courseBiz = courseBiz;
	}

	
		@Action(value = "findAll" ,results = {
				@Result(name = "success",location="list.jsp")})
		public String findAll() {
			System.out.println("验证用户！！！！！！！！！！！");
			list = courseBiz.findAll();
			return "success";
	}
		@Action(value = "findOneCourse" ,results = {
				@Result(name = "success",location="course.jsp"),
				@Result(name = "notLogIn",location="login.jsp")})
		public String findOneCourse() {
			course = courseBiz.findById(id);
			HttpServletRequest request = ServletActionContext.getRequest();  
			HttpSession session = request.getSession();  
			User user = (User) session.getAttribute("currentUser");
			if(user == null){
				return "notLogIn";
			}
			recommendList = courseBiz.recommendUsingCollbaritive(course, user);
			sumrate = sumrateBiz.findByCourseId(course.getCourseId());
			teacher = teacherBiz.findById(course.getTeacherId());
			return "success";
	}
		@Action(value = "findOneCourseTest" ,results = {
				@Result(name = "success",location="course.jsp"),
				@Result(name = "notLogIn",location="login.jsp")})
		public String findOneCourseTest() {
			course = courseBiz.findById(id);
			HttpServletRequest request = ServletActionContext.getRequest();  
			HttpSession session = request.getSession();  
			User user = (User) session.getAttribute("currentUser");
			if(user == null){
				return "notLogIn";
			}
			recommendList = courseBiz.recommendUsingContentBased2(user,course);
			sumrate = sumrateBiz.findByCourseId(course.getCourseId());
			teacher = teacherBiz.findById(course.getTeacherId());
			return "success";
	}
		
		@Action(value = "recommendBaseOnKnowledge" ,results = {
				@Result(name = "success",location="courseList.jsp")})
		public String recommendBaseOnKnowledge() {
			list = courseBiz.recommendUsingKnowledgeBased(recommend);
			System.out.println(recommend);
			return "success";
	}
		
		@Action(value = "courseListByTest" ,results = {
				@Result(name = "success",location="courseList.jsp")})
		public String courseListByTest() {
			list = courseBiz.findAll();
			return "success";
	}
		

}
