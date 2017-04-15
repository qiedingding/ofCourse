package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Recommend;
import edu.stevens.entity.User;

public interface CourseBiz {
	public ArrayList findAll();
	public Course findById(int id);
	public ArrayList findTeahcerId(int id);
	public boolean update(Course course);
	public boolean delete(Course course);
	public boolean insert(Course course);
	public ArrayList recommendUsingCollbaritive(Course course  ,User user);
	public ArrayList recommendUsingKnowledgeBased(Recommend recommend);
	public ArrayList recommendUsingContentBased1(User user);
	public ArrayList recommendUsingContentBased2(User user, Course course);
}
