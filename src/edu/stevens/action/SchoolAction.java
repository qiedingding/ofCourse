package edu.stevens.action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.NationBiz;
import edu.stevens.biz.SchoolBiz;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

@Controller("schoolAction")
public class SchoolAction extends ActionSupport {

	private ArrayList list;
	private School school;
	private int id;

	@Autowired
	@Qualifier("schoolBiz")
	private SchoolBiz schoolBiz;

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SchoolBiz getSchoolBiz() {
		return schoolBiz;
	}

	public void setSchoolBiz(SchoolBiz schoolBiz) {
		this.schoolBiz = schoolBiz;
	}

	@Action(value = "findAll_School", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findAll_School() {
		System.out.println("查看所有");
		list = schoolBiz.findAll();
		return "success";
	}

	@Action(value = "findById_School", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findById_School(int id) {
		System.out.println("查看所有SchoolID");
		school = schoolBiz.findById(id);
		return "success";
	}
	
	@Action(value = "findByName_School", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findByName_School(String name) {
		System.out.println("查看所有SchoolName");
		school = schoolBiz.findByName(name);
		return "success";
	}
}
