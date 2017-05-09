package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Company;
import com.po.Department;

public class DepartmentDao {
	private SessionFactory sessionFactory;
	public List<Department> getAllDepartment(){
		Session session=sessionFactory.openSession();
		List<Department> list=session.createQuery("from Department").list();
		session.close();
		return list;
	}
	public List<Department> queryDepartmentByName(String dname){
		Session session=sessionFactory.openSession();
		List<Department> list=session.createQuery("from Department where dname=?").setString(0,dname).list();
		session.close();
		return list;
	}
	public void addDepartment(Department department){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
		session.close();
		
	}
	public void updateDepartment(Department department){
		 Session session=sessionFactory.openSession();
		    session.beginTransaction();
		    session.update(department);
		    session.getTransaction().commit();
		   session.close();
	}
	public void deleteCompany(int did){
		 Session session=sessionFactory.openSession();
		    session.beginTransaction();
		    Department department=getDepartment(did);
		    session.delete(department);
		    session.getTransaction().commit();
		    session.close();
	}
	public Department getDepartment(int did){
		Session session=sessionFactory.openSession();
		Department department=(Department)session.get(Department.class,did);
		session.close();
		return department;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
