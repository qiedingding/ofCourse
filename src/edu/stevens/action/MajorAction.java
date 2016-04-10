package edu.stevens.action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.CustomBiz;
import edu.stevens.biz.MajorBiz;
import edu.stevens.biz.NationBiz;
import edu.stevens.biz.SchoolBiz;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Major;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

@Controller("majorAction")
public class MajorAction extends ActionSupport {

	private ArrayList list;
	private Major major;
	private int id;
	private boolean is_exsit;


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

	public boolean isIs_exsit() {
		return is_exsit;
	}

	public void setIs_exsit(boolean is_exsit) {
		this.is_exsit = is_exsit;
	}

	@Action(value = "findAll_Major", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findAll() {
		System.out.println("查看所有");
		list = majorBiz.findAll();
		return "success";
	}

	@Action(value = "findById_Major", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByID(int id) {
		System.out.println("查看所有");
		major = majorBiz.findById(id);
		return "success";
	}
	
	@Action(value = "findByName_Major", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByName(String name) {
		System.out.println("查看所有");
		major = majorBiz.findByName(name);
		return "success";
	}
	
	@Action(value = "findByCode_Major", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByCode(String code) {
		System.out.println("查看所有");
		major = majorBiz.findByCode(code);
		return "success";
	}
}
