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
import edu.stevens.dao.CommentDao;
import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.dao.FavoriteDao;
import edu.stevens.dao.IndividualrateDao;
import edu.stevens.entity.Comment;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Favorite;
import edu.stevens.entity.Individualrate;

@Service("individualrateBiz")
@Transactional(readOnly = false)
public class IndividualrateBizImpl implements IndividualrateBiz{

	@Autowired
	@Qualifier("individualrateDao")
	private IndividualrateDao individualrateDao;
	


	public IndividualrateDao getIndividualrateDao() {
		return individualrateDao;
	}
	public void setIndividualrateDao(IndividualrateDao individualrateDao) {
		this.individualrateDao = individualrateDao;
	}
	public ArrayList findAll() {
		return individualrateDao.findAll();
	}
	public Individualrate findById(int id) {
		return individualrateDao.findById(id);
	}
	public boolean update(Individualrate c) {

		return individualrateDao.update(c);
	}
	public boolean delete(Individualrate c) {

		return individualrateDao.delete(c);
	}
	public boolean insert(Individualrate c) {
		// TODO Auto-generated method stub
		return individualrateDao.insert(c);
	}





}
