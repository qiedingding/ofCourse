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
import edu.stevens.biz.FavoriteBiz;
import edu.stevens.biz.IndividualrateBiz;
import edu.stevens.biz.SumrateBiz;
import edu.stevens.dao.CommentDao;
import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.dao.FavoriteDao;
import edu.stevens.dao.IndividualrateDao;
import edu.stevens.dao.SumrateDao;
import edu.stevens.entity.Comment;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Favorite;
import edu.stevens.entity.Individualrate;
import edu.stevens.entity.Sumrate;

@Service("sumrateBiz")
@Transactional(readOnly = false)
public class SumrateBizImpl implements SumrateBiz{

	@Autowired
	@Qualifier("sumrateDao")
	private SumrateDao sumrateDao;
	



	public SumrateDao getSumrateDao() {
		return sumrateDao;
	}
	public void setSumrateDao(SumrateDao sumrateDao) {
		this.sumrateDao = sumrateDao;
	}
	public ArrayList findAll() {
		return sumrateDao.findAll();
	}
	public Sumrate findById(int id) {
		return sumrateDao.findById(id);
	}
	public boolean update(Sumrate c) {

		return sumrateDao.update(c);
	}
	public boolean delete(Sumrate c) {

		return sumrateDao.delete(c);
	}
	public boolean insert(Sumrate c) {
		// TODO Auto-generated method stub
		return sumrateDao.insert(c);
	}
	public Sumrate findByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return sumrateDao.findByCourseId(courseId);
	}





}
