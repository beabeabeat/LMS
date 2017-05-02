package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Department;

public class DepartmentDao {
	private SessionFactory sessionFactory;
	public List<Department> getAllDepartment(){
		Session session=sessionFactory.openSession();
		List<Department> list=session.createQuery("from Department").list();
		return list;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
