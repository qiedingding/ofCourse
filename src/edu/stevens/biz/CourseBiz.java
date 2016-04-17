package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.User;

public interface CourseBiz {
	public ArrayList findAll();
	public Course findById(int id);
	public ArrayList findTeahcerId(int id);
	public boolean update(Course course);
	public boolean delete(Course course);
	public boolean insert(Course course);
	public ArrayList recommend(Course course  ,User user);
	
}
