package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.CourseBiz;
import edu.stevens.biz.CustomBiz;
import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;

@Service("courseBiz")
@Transactional(readOnly = false)
public class CourseBizImpl implements CourseBiz{

	@Autowired
	@Qualifier("courseDao")
	private CourseDao courseDao;
	

	public CourseDao getCourseDao() {
		return courseDao;
	}
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	public ArrayList findAll() {
		return courseDao.findAll();
	}
	public Course findById(int id) {
		return courseDao.findById(id);
	}
	public boolean update(Course course) {

		return courseDao.update(course);
	}
	public boolean delete(Course course) {

		return courseDao.delete(course);
	}
	public boolean insert(Course course) {
		// TODO Auto-generated method stub
		return courseDao.insert(course);
	}
	public ArrayList findTeahcerId(int id) {
		return courseDao.findTeahcerId(id);
	}
	public ArrayList<Course> recommend(Course course) {
		ArrayList<Course> list = new ArrayList<Course>();
		list.add(course);
		list.add(course);
		list.add(course);
		return list;
	}




}
