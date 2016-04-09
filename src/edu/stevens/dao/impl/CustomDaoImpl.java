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


import edu.stevens.dao.CustomDao;
import edu.stevens.entity.Custom;

@Repository("customDao")
@Transactional
public class CustomDaoImpl extends HibernateDaoSupport implements CustomDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from Custom";
		ArrayList<Custom> list=(ArrayList<Custom>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Custom findById(final int id) {
		Custom custom=(Custom) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Custom as c where c.id="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return custom;
	}

	public boolean update(Custom custom) {
		System.out.println("更新DAO！！！！！");
		super.getHibernateTemplate().update(custom);
		return true;
	}

	public boolean delete(Custom custom) {

		super.getHibernateTemplate().delete(custom);
		return true;
	}

	public boolean validate_user(final Custom custom) {
		boolean f =  super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Custom as c where c.cname="+custom.getCname();
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return false;
				} else {
					return true;
				}
			}			
		});
		return f;
	}

	

}
