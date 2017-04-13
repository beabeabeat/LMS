package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Employee;


public class EmployeeDao {
	private SessionFactory sessionFactory;
	public Employee getEmployee(int eid){
		Session session=sessionFactory.openSession();
		Employee employee=(Employee)session.get(Employee.class,eid);
		return employee;
	}
	
	public List<Employee> queryEmployee(String query){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee where eid =? or department=(from Department where dname=?) or company=(from Company where cname=?)").setInteger(0,Integer.parseInt(query)).setString(1,query).setString(2,query).list();
		return list;
	}
	public List<Employee> queryEmployeesByID(int id){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee where eid=?").setInteger(0,id).list();
		return list;
	}
	public List<Employee> queryEmployeesByDepartment(String department){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee where department=(select did from Department where dname=?)").setString(0,department).list();
		return list;
	}
	public List<Employee> queryEmployeesByCompany(String company){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee where company=(select cid from Company where cname=?)").setString(0,company).list();
		return list;
	}
	public Employee getEmployeeByEname(String ename){
		Session session=sessionFactory.openSession();
		Employee employee=(Employee)session.createQuery("from Employee where ename=?").setString(0,ename).list().get(0);
		return employee;
	}
	public List<Employee> getAllEmployees(){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee").list();
		return list;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
