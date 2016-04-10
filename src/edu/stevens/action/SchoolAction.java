package edu.stevens.action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.CustomBiz;
import edu.stevens.biz.NationBiz;
import edu.stevens.biz.SchoolBiz;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

@Controller("schoolAction")
public class SchoolAction extends ActionSupport {

	private ArrayList list;
	private School school;
	private int id;
	private boolean is_exsit;


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

	public boolean isIs_exsit() {
		return is_exsit;
	}

	public void setIs_exsit(boolean is_exsit) {
		this.is_exsit = is_exsit;
	}

	@Action(value = "findAll_School", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findAll() {
		System.out.println("查看所有");
		list = schoolBiz.findAll();
		return "success";
	}

	@Action(value = "findById_School", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByID(int id) {
		System.out.println("查看所有");
		school = schoolBiz.findById(id);
		return "success";
	}
	
	@Action(value = "findByName_School", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByName(String name) {
		System.out.println("查看所有");
		school = schoolBiz.findByName(name);
		return "success";
	}
}
