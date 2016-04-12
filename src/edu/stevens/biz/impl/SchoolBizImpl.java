package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import edu.stevens.biz.NationBiz;
import edu.stevens.biz.SchoolBiz;
import edu.stevens.dao.NationDao;
import edu.stevens.dao.SchoolDao;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

@Service("schoolBiz")
@Transactional(readOnly = false)
public class SchoolBizImpl implements SchoolBiz{

	@Autowired
	@Qualifier("schoolDao")
	private SchoolDao schoolDao;

	public SchoolDao getSchoolDao() {
		return schoolDao;
	}
	
	public void setSchoolDao(SchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}
	
	public ArrayList findAll() {
		return schoolDao.findAll();
	}
	
	public School findById(int id) {
		return schoolDao.findById(id);
	}
	
	public School findByName(String name) {
		return schoolDao.findByName(name);
	}
	
}
