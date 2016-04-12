package edu.stevens.action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.MajorBiz;
import edu.stevens.biz.NationBiz;
import edu.stevens.biz.SchoolBiz;
import edu.stevens.entity.Major;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

@Controller("majorAction")
public class MajorAction extends ActionSupport {

	private ArrayList list;
	private Major major;
	private int id;

	@Autowired
	@Qualifier("majorBiz")
	private MajorBiz majorBiz;

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MajorBiz getMajorBiz() {
		return majorBiz;
	}

	public void setMajorBiz(MajorBiz majorBiz) {
		this.majorBiz = majorBiz;
	}

	@Action(value = "findAll_Major", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findAll_Major() {
		System.out.println("查看所有");
		list = majorBiz.findAll();
		return "success";
	}

	@Action(value = "findById_Major", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findById_Major(int id) {
		System.out.println("查看所有MajorID");
		major = majorBiz.findById(id);
		return "success";
	}
	
	@Action(value = "findByName_Major", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findByName_Major(String name) {
		System.out.println("查看所有MajorName");
		major = majorBiz.findByName(name);
		return "success";
	}
	
	@Action(value = "findByCode_Major", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findByCode_Major(int id) {
		System.out.println("查看所有MajorCode");
		major = majorBiz.findByCode(id);
		return "success";
	}
}
