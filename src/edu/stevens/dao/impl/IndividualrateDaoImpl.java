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


import edu.stevens.dao.CommentDao;
import edu.stevens.dao.FavoriteDao;
import edu.stevens.dao.IndividualrateDao;
import edu.stevens.entity.Comment;
import edu.stevens.entity.Favorite;
import edu.stevens.entity.Individualrate;

@Repository("individualrateDao")
@Transactional
public class IndividualrateDaoImpl extends HibernateDaoSupport implements IndividualrateDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from individualrate";
		ArrayList<Individualrate> list=(ArrayList<Individualrate>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Individualrate findById(final int id) {
		Individualrate f=(Individualrate) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Individualrate as c where c.id="+id;
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

	public boolean update(Individualrate f) {
		System.out.println("更新DAO！！！！！");
		super.getHibernateTemplate().update(f);
		return true;
	}

	public boolean delete(Individualrate f) {

		super.getHibernateTemplate().delete(f);
		return true;
	}

	public boolean insert(Individualrate f) {
		super.getHibernateTemplate().save(f);
		return true;
	}



}
