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
import edu.stevens.dao.CommentDao;
import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.dao.FavoriteDao;
import edu.stevens.entity.Comment;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Favorite;

@Service("favoriteBiz")
@Transactional(readOnly = false)
public class FavoriteBizImpl implements FavoriteBiz{

	@Autowired
	@Qualifier("favoriteDao")
	private FavoriteDao favoriteDao;
	


	public FavoriteDao getFavoriteDao() {
		return favoriteDao;
	}
	public void setFavoriteDao(FavoriteDao favoriteDao) {
		this.favoriteDao = favoriteDao;
	}
	public ArrayList findAll() {
		return favoriteDao.findAll();
	}
	public Favorite findById(int id) {
		return favoriteDao.findById(id);
	}
	public boolean update(Favorite c) {

		return favoriteDao.update(c);
	}
	public boolean delete(Favorite c) {

		return favoriteDao.delete(c);
	}
	public boolean insert(Favorite c) {
		// TODO Auto-generated method stub
		return favoriteDao.insert(c);
	}





}
