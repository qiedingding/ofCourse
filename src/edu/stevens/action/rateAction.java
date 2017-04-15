package edu.stevens.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
import edu.stevens.biz.SumrateBiz;
import edu.stevens.biz.TeacherBiz;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Recommend;
import edu.stevens.entity.Sumrate;
import edu.stevens.entity.Teacher;
import edu.stevens.entity.User;

@Controller("rateAction")
public class rateAction extends ActionSupport {

	private ArrayList list;
	private int id;
	private Sumrate sumrate;
	private Course course;
	private User user;
	
	@Autowired
	@Qualifier("courseBiz")
	private CourseBiz courseBiz;
	@Autowired
	@Qualifier("sumrateBiz")
	private SumrateBiz sumrateBiz;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	
		@Action(value = "rateACourse" ,results = {
				@Result(name = "success",location="rateCourse.jsp"),
				@Result(name = "notLogIn",location="login.jsp")})
		public String rateACourse() {
			course = courseBiz.findById(id);
			HttpServletRequest request = ServletActionContext.getRequest();  
			HttpSession session = request.getSession();  
			user = (User) session.getAttribute("currentUser");
			if(user == null){
				return "notLogIn";
			}
			return "success";
	}
	
	
		

}
