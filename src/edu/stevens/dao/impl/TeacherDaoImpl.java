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
import edu.stevens.dao.TeacherDao;
import edu.stevens.entity.Comment;
import edu.stevens.entity.Teacher;

@Repository("teacherDao")
@Transactional
public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from Teacher";
		ArrayList<Teacher> list=(ArrayList<Teacher>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Teacher findById(final int id) {
		Teacher t=(Teacher) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Teacher as c where c.teacherId="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return t;
	}

	public boolean update(Teacher t) {
		System.out.println("更新DAO！！！！！");
		super.getHibernateTemplate().update(t);
		return true;
	}

	public boolean delete(Teacher t) {

		super.getHibernateTemplate().delete(t);
		return true;
	}

	public boolean insert(Teacher t) {
		super.getHibernateTemplate().save(t);
		return true;
	}

}
