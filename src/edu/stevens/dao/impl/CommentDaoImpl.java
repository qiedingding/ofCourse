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
import edu.stevens.entity.Comment;

@Repository("commentDao")
@Transactional
public class CommentDaoImpl extends HibernateDaoSupport implements CommentDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from Comment";
		ArrayList<Comment> list=(ArrayList<Comment>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Comment findById(final int id) {
		Comment comment=(Comment) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Comment as c where c.id="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return comment;
	}

	public boolean update(Comment comment) {
		System.out.println("更新DAO！！！！！");
		super.getHibernateTemplate().update(comment);
		return true;
	}

	public boolean delete(Comment comment) {

		super.getHibernateTemplate().delete(comment);
		return true;
	}

	public boolean insert(Comment comment) {
		super.getHibernateTemplate().save(comment);
		return true;
	}

}
