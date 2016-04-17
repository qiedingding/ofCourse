package edu.stevens.action;

import java.util.ArrayList;

import javax.jms.Session;
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
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.User;

@Controller("courseAction")
public class CourseAction extends ActionSupport {

	private ArrayList list;
	private ArrayList recommendList;
	private int id;
	private Course course;
	@Autowired
	@Qualifier("courseBiz")
	private CourseBiz courseBiz;




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
				@Result(name = "success",location="course.jsp")})
		public String findOneCourse() {
			course = courseBiz.findById(id);
			HttpServletRequest request = ServletActionContext.getRequest();  
			HttpSession session = request.getSession();  
			User user = (User) session.getAttribute("currentUser");
			recommendList = courseBiz.recommend(course,user);
			return "success";
	}
		

}
