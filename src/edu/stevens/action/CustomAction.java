package edu.stevens.action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import edu.stevens.biz.CustomBiz;
import edu.stevens.entity.Custom;

@Controller("customAction")
public class CustomAction extends ActionSupport {

	private ArrayList list;
	private Custom custom;
	private int id;
	private boolean is_exsit;


	@Autowired
	@Qualifier("customBiz")
	private CustomBiz customBiz;

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public Custom getCustom() {
		return custom;
	}

	public void setCustom(Custom custom) {
		this.custom = custom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomBiz getCustomBiz() {
		return customBiz;
	}

	public void setCustomBiz(CustomBiz customBiz) {
		this.customBiz = customBiz;
	}



	public boolean isIs_exsit() {
		return is_exsit;
	}

	public void setIs_exsit(boolean is_exsit) {
		this.is_exsit = is_exsit;
	}

	@Action(value = "findAll", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "Terror.jsp") })
	public String findAll() {
		System.out.println("查看所有");
		list = customBiz.findAll();
		return "success";
	}

	@Action(value = "del", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "error.jsp") })
	public String del() {
		System.out.println("删除");
		Custom c = customBiz.findById(id);
		if (customBiz.delete(c)) {
			list = customBiz.findAll();
			return "success";
		} else {
			return "error";
		}
	}

	@Action(value = "toUpdate", results = {
			@Result(name = "success", location = "update.jsp"),
			@Result(name = "error", location = "error.jsp") })
	public String toUpdate() {
		System.out.println("跳转到修改页面");
		custom = customBiz.findById(id);
		return "success";
	}

	@Action(value = "update", results = {
			@Result(name = "success", location = "list.jsp"),
			@Result(name = "error", location = "error.jsp") })
	public String update() {
		System.out.println("修改操作啊");
		if (customBiz.update(custom)) {
			custom = null;
			list  = customBiz.findAll();
			return "success";
		} else {

			return "error";
		}
	}
		@Action(value = "validate_user" ,results = {
				@Result(name = "success",location="update.jsp")})
		public String validate_user() {
			System.out.println("验证用户！！！！！！！！！！！");
			if (customBiz.validate_user(custom)) {
				is_exsit = true;
				return "success";
			} else {
				is_exsit = false;
				return "success";
			}
	}

}
