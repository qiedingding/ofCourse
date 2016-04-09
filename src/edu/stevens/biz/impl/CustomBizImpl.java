package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.CustomBiz;
import edu.stevens.dao.CustomDao;
import edu.stevens.entity.Custom;

@Service("customBiz")
@Transactional(readOnly = false)
public class CustomBizImpl implements CustomBiz{

	@Autowired
	@Qualifier("customDao")
	private CustomDao customDao;

	


	

	public CustomDao getCustomDao() {
		return customDao;
	}
	public void setCustomDao(CustomDao customDao) {
		this.customDao = customDao;
	}
	public ArrayList findAll() {
		return customDao.findAll();
	}
	public Custom findById(int id) {
		return customDao.findById(id);
	}
	public boolean update(Custom custom) {

		return customDao.update(custom);
	}
	public boolean delete(Custom custom) {

		return customDao.delete(custom);
	}
	public boolean validate_user(Custom custom) {

		return customDao.validate_user(custom);
	}



}
