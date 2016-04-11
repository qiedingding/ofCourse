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
import edu.stevens.dao.SumrateDao;
import edu.stevens.dao.UserDao;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Sumrate;
import edu.stevens.entity.User;

@Repository("sumrateDao")
@Transactional
public class SumrateDaoImpl extends HibernateDaoSupport implements SumrateDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from User";
		ArrayList<Sumrate> list=(ArrayList<Sumrate>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Sumrate findById(final int id) {
		Sumrate f=(Sumrate) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Sumrate as c where c.id="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return f;
	}

	public boolean update(Sumrate f) {
		super.getHibernateTemplate().update(f);
		return true;
	}

	public boolean delete(Sumrate f) {

		super.getHibernateTemplate().delete(f);
		return true;
	}

	public boolean insert(Sumrate sumrate) {
		super.getHibernateTemplate().save(sumrate);
		return true;
	}

	

	

}
