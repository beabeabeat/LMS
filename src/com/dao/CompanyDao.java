package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Company;
import com.po.Employee;

public class CompanyDao {
	private SessionFactory sessionFactory;
	public List<Company> getAllCompany(){
		Session session=sessionFactory.openSession();
		List<Company> list=session.createQuery("from Company").list();
		return list;
	}
	public void addCompany(Company company){
		Session session=sessionFactory.openSession();
		session.save(company);
	}
	public Company getCompany(int cid){
		Session session=sessionFactory.openSession();
		Company company=(Company)session.get(Company.class,cid);
		return company;
	}
	public void deleteCompany(int cid){
		 Session session=sessionFactory.openSession();
		    session.beginTransaction();
		    Company company=getCompany(cid);
		    session.update(company);
		    session.getTransaction().commit();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
