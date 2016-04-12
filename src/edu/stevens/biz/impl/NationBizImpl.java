package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.NationBiz;
import edu.stevens.dao.NationDao;
import edu.stevens.entity.Nation;

@Service("nationBiz")
@Transactional(readOnly = false)
public class NationBizImpl implements NationBiz{

	@Autowired
	@Qualifier("nationDao")
	private NationDao nationDao;

	public NationDao getNationDao() {
		return nationDao;
	}
	
	public void setNationDao(NationDao nationDao) {
		this.nationDao = nationDao;
	}
	
	public ArrayList findAll() {
		return nationDao.findAll();
	}
	
	public Nation findById(int id) {
		return nationDao.findById(id);
	}
	
	public Nation findByName(String name) {
		return nationDao.findByName(name);
	}
	
}
