package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Role;

public class RoleDao {
	private SessionFactory sessionFactory;
	public List<Role> getAllRoles(){
		Session session=sessionFactory.openSession();
		List<Role> list=session.createQuery("from Role").list();
		return list;
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
