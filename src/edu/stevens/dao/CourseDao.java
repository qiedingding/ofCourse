package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;

public interface CourseDao {
	
	public ArrayList findAll();
	public Course findById(int id);
	public ArrayList findTeahcerId(int id);
	public boolean update(Course course);
	public boolean delete(Course course);
	public boolean insert(Course course);
	
}
