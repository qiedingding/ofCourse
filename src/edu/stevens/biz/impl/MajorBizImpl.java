package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.MajorBiz;
import edu.stevens.biz.NationBiz;
import edu.stevens.biz.SchoolBiz;
import edu.stevens.dao.MajorDao;
import edu.stevens.dao.NationDao;
import edu.stevens.dao.SchoolDao;
import edu.stevens.entity.Major;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

@Service("majorBiz")
@Transactional(readOnly = false)
public class MajorBizImpl implements MajorBiz{

	@Autowired
	@Qualifier("majorDao")
	private MajorDao majorDao;

	public MajorDao getMajorDao() {
		return majorDao;
	}
	
	public void setMajorDao(MajorDao majorDao) {
		this.majorDao = majorDao;
	}
	
	public ArrayList findAll() {
		return majorDao.findAll();
	}
	
	public Major findById(int id) {
		return majorDao.findById(id);
	}
	
	public Major findByName(String name) {
		return majorDao.findByName(name);
	}
	
	public Major findByCode(int id) {
		return majorDao.findByCode(id);
	}
}
