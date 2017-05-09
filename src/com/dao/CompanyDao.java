package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.po.Company;
import com.po.Employee;

public class CompanyDao {
	private SessionFactory sessionFactory;
	public List<Company> queryCompanyByName(String cname){
		Session session=sessionFactory.openSession();
		List<Company> list=session.createQuery("from Company where cname=?").setString(0,cname).list();
		session.close();
		return list;
	}
	public List<Company> queryCompanyByAddress(String province,String city,String county,String street){
		Session session=sessionFactory.openSession();
		List<Company> list=session.createQuery("from Company where province=? and city=? and county=? and street=?").setString
				(0,province).setString(1, city).setString(2, county).setString(3,street).list();
		session.close();
		return list;
		
	}
	public List<Company> getAllCompany(){
		Session session=sessionFactory.openSession();
		List<Company> list=session.createQuery("from Company").list();
		session.close();
		return list;
	}
	public void addCompany(Company company){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(company);
		session.getTransaction().commit();
		session.close();
	}
	public Company getCompany(int cid){
		Session session=sessionFactory.openSession();
		Company company=(Company)session.get(Company.class,cid);
		session.close();
		return company;
	}
	public void updateCompany(Company company){
		 Session session=sessionFactory.openSession();
		    session.beginTransaction();
		    session.update(company);
		    session.getTransaction().commit();
		   session.close();
	}
	public void deleteCompany(int cid){
		 Session session=sessionFactory.openSession();
		    session.beginTransaction();
		    Company company=getCompany(cid);
		    session.delete(company);
		    session.getTransaction().commit();
		    session.close();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
