package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Employee;
import com.po.Role;

public class RoleDao {
	private SessionFactory sessionFactory;
	
	public void updateRole(Role role){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(role);
		session.getTransaction().commit();
		session.close();
	}
	public List<Role> getAllRoles(){
		Session session=sessionFactory.openSession();
		List<Role> list=session.createQuery("from Role").list();
		session.close();
		return list;	
	}
	public Role getRolesById(int rid){
		Session session=sessionFactory.openSession();
		Role role=(Role)session.get(Role.class, rid);
		session.close();
		return role;	
	}
	public String queryNameById(int rid){
		Session session=sessionFactory.openSession();
		String rname=session.createQuery("select rname from Role where rid=?").setInteger(0,rid).list().toString();
		return rname;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
