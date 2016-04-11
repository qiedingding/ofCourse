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
import edu.stevens.dao.CommentDao;
import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.entity.Comment;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;

@Service("commentBiz")
@Transactional(readOnly = false)
public class CommentBizImpl implements CommentBiz{

	@Autowired
	@Qualifier("commentDao")
	private CommentDao commentDao;
	


	public CommentDao getCommentDao() {
		return commentDao;
	}
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	public ArrayList findAll() {
		return commentDao.findAll();
	}
	public Comment findById(int id) {
		return commentDao.findById(id);
	}
	public boolean update(Comment c) {

		return commentDao.update(c);
	}
	public boolean delete(Comment c) {

		return commentDao.delete(c);
	}
	public boolean insert(Comment c) {
		// TODO Auto-generated method stub
		return commentDao.insert(c);
	}





}
