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
import edu.stevens.entity.Comment;
import edu.stevens.entity.Favorite;

@Repository("favoriteDao")
@Transactional
public class FavoriteDaoImpl extends HibernateDaoSupport implements FavoriteDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from Favorite";
		ArrayList<Favorite> list=(ArrayList<Favorite>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Favorite findById(final int id) {
		Favorite f=(Favorite) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Favorite as c where c.id="+id;
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

	public boolean update(Favorite f) {
		System.out.println("更新DAO！！！！！");
		super.getHibernateTemplate().update(f);
		return true;
	}

	public boolean delete(Favorite f) {

		super.getHibernateTemplate().delete(f);
		return true;
	}

	public boolean insert(Favorite f) {
		super.getHibernateTemplate().save(f);
		return true;
	}

}
