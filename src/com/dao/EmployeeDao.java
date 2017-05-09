package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Employee;


public class EmployeeDao {
	private SessionFactory sessionFactory;
	public void deleteEmployeeById(int id){//逻辑删除 置state为0ְ
	    Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    Employee employee=getEmployee(id);
	    employee.seteState(0);
	    session.update(employee);
	    session.getTransaction().commit();
	    session.close();
	     
	}
	public void updateEmployee(Employee employee){
	    Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.update(employee);
	    session.getTransaction().commit();
	   session.close();
	}
	public Employee getEmployee(int eid){
		Session session=sessionFactory.openSession();
		Employee employee=(Employee)session.get(Employee.class, eid);
		//Employee employee=(Employee)session.createQuery("from Employee where eid=?").setInteger(0,eid).list().get(0);
		session.close();
		return employee;
		
	}
	
	public void addEmployee(Employee employee){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		
	}
	public List<Employee> queryEmployeesByID(int id){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee where eid=?").setInteger(0,id).list();
		session.close();
		return list;
	}
	public List<Employee> queryEmployeesByDepartment(String department){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee where department=(select did from Department where dname=?)").setString(0,department).list();
		session.close();
		return list;
	}
	public List<Employee> queryEmployeesByCompany(String company){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee where company=(select cid from Company where cname=?)").setString(0,company).list();
		session.close();
		return list;
	}
	public Employee getEmployeeByEname(String ename){
		Session session=sessionFactory.openSession();
		Employee employee=(Employee)session.createQuery("from Employee where ename=?").setString(0,ename).list().get(0);
		session.close();
		return employee;
	}
	public List<Employee> getAllEmployees(){
		Session session=sessionFactory.openSession();
		List<Employee> list=session.createQuery("from Employee where eState<>0").list();
		session.close();
		return list;
	}
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
