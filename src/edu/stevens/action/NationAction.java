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
import edu.stevens.entity.Custom;
import edu.stevens.entity.Nation;

@Controller("nationAction")
public class NationAction extends ActionSupport {

	private ArrayList list;
	private Nation nation;
	private int id;
	private boolean is_exsit;


	@Autowired
	@Qualifier("nationBiz")
	private NationBiz nationBiz;

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public Nation getNation() {
		return nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NationBiz getNationBiz() {
		return nationBiz;
	}

	public void setNationBiz(NationBiz nationBiz) {
		this.nationBiz = nationBiz;
	}

	public boolean isIs_exsit() {
		return is_exsit;
	}

	public void setIs_exsit(boolean is_exsit) {
		this.is_exsit = is_exsit;
	}

	@Action(value = "findAll_Nation", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findAll() {
		System.out.println("查看所有");
		list = nationBiz.findAll();
		return "success";
	}

	@Action(value = "findById_Nation", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByID(int id) {
		System.out.println("查看所有");
		nation = nationBiz.findById(id);
		return "success";
	}
	
	@Action(value = "findByName_Nation", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findByName(String name) {
		System.out.println("查看所有");
		nation = nationBiz.findByName(name);
		return "success";
	}

}
