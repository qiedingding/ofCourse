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
import edu.stevens.dao.UserDao;
import edu.stevens.entity.Custom;
import edu.stevens.entity.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from User";
		ArrayList<User> list=(ArrayList<User>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public User findById(final int id) {
		User user=(User) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from User as c where c.id="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return user;
	}

	public boolean update(User user) {
		super.getHibernateTemplate().update(user);
		return true;
	}

	public boolean delete(User user) {

		super.getHibernateTemplate().delete(user);
		return true;
	}

	public boolean validate_user(final User user) {
		boolean f =  super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from User as c where c.userName="+user.getUserName();
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
