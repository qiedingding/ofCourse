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


import edu.stevens.dao.CourseDao;
import edu.stevens.dao.CustomDao;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;

@Repository("courseDao")
@Transactional
public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {

	public ArrayList findAll() {
		System.out.println("查看所有！！！！！！！！！！！！！");
		String hql="from Course";
		ArrayList<Course> list=(ArrayList<Course>) super.getHibernateTemplate().find(hql);
		return list;
	}

	public Course findById(final int id) {
		Course course=(Course) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Course as c where c.id="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result.get(0);
				} else {
					return null;
				}
			}			
		});
		return course;
	}

	public boolean update(Course course) {
		System.out.println("更新DAO！！！！！");
		super.getHibernateTemplate().update(course);
		return true;
	}

	public boolean delete(Course course) {

		super.getHibernateTemplate().delete(course);
		return true;
	}

	public boolean insert(Course course) {
		super.getHibernateTemplate().save(course);
		return true;
	}

	public ArrayList findTeahcerId(final int id) {
		ArrayList list =(ArrayList) super.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Course as c where c.teacherId="+id;
				Query query=session.createQuery(hql);
				List result=query.list();
				if (result.size()>0) {
					return result;
				} else {
					return null;
				}
			}			
		});
		return list;
	}

	
	

}
