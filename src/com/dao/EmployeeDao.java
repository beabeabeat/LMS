package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Employee;


public class EmployeeDao {
	private SessionFactory sessionFactory;
	public void deleteEmployeeById(int id){//Âß¼­É¾³ý£¬ÉèÖÃ×´Ì¬ÎªÀëÖ°
	    Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    Employee employee=getEmployee(id);
	    employee.seteState(0);
	    session.update(employee);
	    session.getTransaction().commit();
	     
	}
	public void updateEmployee(int id,String ename,String realName,String password,String phoneNumber,String company,String department,int eState,int roleID){
	    Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    Employee employee=getEmployee(id);
	    employee.setEname(ename);
	    employee.setRealName(realName);
	    employee.setPassword(password);
	    employee.setPhoneNumber(phoneNumber);
	    employee.setCompany(company);
	    employee.setDepartment(department);
	    employee.setRoleID(roleID);
	    employee.seteState(eState);
	    session.update(employee);
	    session.getTransaction().commit(); 
	}
	public Employee getEmployee(int eid){
		Session session=sessionFactory.openSession();
		Employee employee=(Employee)session.get(Employee.class,eid);
		return employee;
	}
	
	public void addEmployee(Employee employee){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
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
		List<Employee> list=session.createQuery("from Employee where eState<>0").list();
		return list;
	}
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
