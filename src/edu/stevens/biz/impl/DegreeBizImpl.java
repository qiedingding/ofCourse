package edu.stevens.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.biz.DegreeBiz;
import edu.stevens.biz.NationBiz;
import edu.stevens.dao.DegreeDao;
import edu.stevens.dao.NationDao;
import edu.stevens.entity.Degree;
import edu.stevens.entity.Nation;

@Service("degreeBiz")
@Transactional(readOnly = false)
public class DegreeBizImpl implements DegreeBiz{

	@Autowired
	@Qualifier("degreeDao")
	private DegreeDao degreeDao;

	public DegreeDao getDegreeDao() {
		return degreeDao;
	}
	
	public void setDegreeDao(DegreeDao degreeDao) {
		this.degreeDao = degreeDao;
	}
	
	public ArrayList findAll() {
		return degreeDao.findAll();
	}
	
	public Degree findById(int id) {
		return degreeDao.findById(id);
	}
	
	public Degree findByName(String name) {
		return degreeDao.findByName(name);
	}
	
}
