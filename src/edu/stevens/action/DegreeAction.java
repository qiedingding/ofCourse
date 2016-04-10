package edu.stevens.action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.CustomBiz;
import edu.stevens.biz.DegreeBiz;
import edu.stevens.biz.NationBiz;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Degree;
import edu.stevens.entity.Nation;

@Controller("degreeAction")
public class DegreeAction extends ActionSupport {

	private ArrayList list;
	private Degree degree;
	private int id;
	private boolean is_exsit;


	@Autowired
	@Qualifier("degreeBiz")
	private DegreeBiz degreeBiz;

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DegreeBiz getDegreeBiz() {
		return degreeBiz;
	}

	public void setDegreeBiz(DegreeBiz degreeBiz) {
		this.degreeBiz = degreeBiz;
	}

	public boolean isIs_exsit() {
		return is_exsit;
	}

	public void setIs_exsit(boolean is_exsit) {
		this.is_exsit = is_exsit;
	}

	@Action(value = "findAll_Degree", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findAll() {
		System.out.println("查看所有");
		list = degreeBiz.findAll();
		return "success";
	}

	@Action(value = "findById_Degree", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByID(int id) {
		System.out.println("查看所有");
		degree = degreeBiz.findById(id);
		return "success";
	}
	
	@Action(value = "findByName_Degree", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByName(String name) {
		System.out.println("查看所有");
		degree = degreeBiz.findByName(name);
		return "success";
	}

}
