package edu.stevens.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import edu.stevens.dao.NationDao;
import edu.stevens.dao.SchoolDao;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

@Repository("schoolDao")
@Transactional
public class SchoolDaoImpl extends HibernateDaoSupport implements SchoolDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from School";
		ArrayList<School> list=(ArrayList<School>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public School findById(final int id) {
		School school=(School) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from School as c where c.schoolCode="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return school;
	}
	
	public School findByName(final String name) {
		School school=(School) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from School as c where c.schoolName ="+ name;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return school;
	}
}
