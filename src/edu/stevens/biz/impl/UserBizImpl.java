package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.CustomBiz;
import edu.stevens.biz.UserBiz;
import edu.stevens.dao.CustomDao;
import edu.stevens.dao.UserDao;
import edu.stevens.entity.Custom;
import edu.stevens.entity.User;

@Service("userBiz")
@Transactional(readOnly = false)
public class UserBizImpl implements UserBiz{

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public ArrayList findAll() {
		return userDao.findAll();
	}
	public User findById(int id) {
		return userDao.findById(id);
	}
	public boolean update(User user) {

		return userDao.update(user);
	}
	public boolean delete(User user) {

		return userDao.delete(user);
	}
	public boolean validate_user(User user) {

		return userDao.validate_user(user);
	}



}
