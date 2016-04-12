package edu.stevens.action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.NationBiz;
import edu.stevens.entity.Nation;

@Controller("nationAction")
public class NationAction extends ActionSupport {

	private ArrayList list;
	private Nation nation;
	private int id;

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

	@Action(value = "findAll_Nation", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findAll_Nation() {
		System.out.println("查看所有");
		list = nationBiz.findAll();
		return "success";
	}

	@Action(value = "findById_Nation", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findById_Nation(int id) {
		System.out.println("查看所有NationID");
		nation = nationBiz.findById(id);
		return "success";
	}
	
	@Action(value = "findByName_Nation", results = {
			@Result(name = "success", location = "list.jsp")})
	public String findByName_Nation(String name) {
		System.out.println("查看所有NationName");
		nation = nationBiz.findByName(name);
		return "success";
	}

}
