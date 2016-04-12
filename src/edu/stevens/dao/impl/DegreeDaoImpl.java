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


import edu.stevens.dao.DegreeDao;
import edu.stevens.dao.NationDao;
import edu.stevens.entity.Degree;
import edu.stevens.entity.Nation;

@Repository("degreeDao")
@Transactional
public class DegreeDaoImpl extends HibernateDaoSupport implements DegreeDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from Degree";
		ArrayList<Degree> list=(ArrayList<Degree>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Degree findById(final int id) {
		Degree degree=(Degree) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Degree as c where c.degreeId="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return degree;
	}
	
	public Degree findByName(final String name) {
		Degree degree=(Degree) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Degree as c where c.degreeName ="+ name;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return degree;
	}
}
