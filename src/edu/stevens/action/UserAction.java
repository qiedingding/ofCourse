package edu.stevens.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.CustomBiz;
import edu.stevens.biz.UserBiz;
import edu.stevens.entity.Custom;
import edu.stevens.entity.User;

@Controller("userAction")
public class UserAction extends ActionSupport {
	private User user;
	private int id;
	private int isExist;
	private String message;
	
	private ArrayList list;
	@Autowired
	@Qualifier("userBiz")
	private UserBiz userBiz;

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsExist() {
		return isExist;
	}

	public void setIsExist(int isExist) {
		this.isExist = isExist;
	}

	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Action(value = "login", results = {
			@Result(name = "success", location = "home.jsp"),
			@Result(name = "fail", location = "login.jsp") })
	public String login() {
		System.out.println("user login");
		User u  = userBiz.login(user);
		if(u==null){
			message = "your userName or password error, please try again";
			return "fail";
		}
		return "success";
	}

}
