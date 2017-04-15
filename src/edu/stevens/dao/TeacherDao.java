package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Comment;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Teacher;

public interface TeacherDao {
	
	public ArrayList findAll();
	public Teacher findById(int id);
	public boolean update(Teacher t);
	public boolean delete(Teacher t);
	public boolean insert(Teacher t);
	
}
