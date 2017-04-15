package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.CommentBiz;
import edu.stevens.biz.CourseBiz;
import edu.stevens.biz.CustomBiz;
import edu.stevens.biz.TeacherBiz;
import edu.stevens.dao.CommentDao;
import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.dao.TeacherDao;
import edu.stevens.entity.Comment;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Teacher;

@Service("teacherBiz")
@Transactional(readOnly = false)
public class TeacherBizImpl implements TeacherBiz{

	@Autowired
	@Qualifier("teacherDao")
	private TeacherDao teacherDao;
	



	public TeacherDao getTeacherDao() {
		return teacherDao;
	}
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	public ArrayList findAll() {
		return teacherDao.findAll();
	}
	public Teacher findById(int id) {
		return teacherDao.findById(id);
	}
	public boolean update(Teacher c) {

		return teacherDao.update(c);
	}
	public boolean delete(Teacher c) {

		return teacherDao.delete(c);
	}
	public boolean insert(Teacher c) {
		// TODO Auto-generated method stub
		return teacherDao.insert(c);
	}





}
