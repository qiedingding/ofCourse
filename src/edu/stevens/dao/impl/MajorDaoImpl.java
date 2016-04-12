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


import edu.stevens.dao.MajorDao;
import edu.stevens.dao.NationDao;
import edu.stevens.dao.SchoolDao;
import edu.stevens.entity.Major;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

@Repository("majorDao")
@Transactional
public class MajorDaoImpl extends HibernateDaoSupport implements MajorDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from Major";
		ArrayList<Major> list=(ArrayList<Major>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Major findById(final int id) {
		Major major=(Major) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Major as c where c.majorId="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return major;
	}
	
	public Major findByName(final String name) {
		Major major=(Major) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Major as c where c.majorName ="+ name;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return major;
	}
	
	public Major findByCode(final int id) {
		Major major=(Major) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Major as c where c.majorCode ="+ id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return major;
	}
}
