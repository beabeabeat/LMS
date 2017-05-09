package com.service;

import java.util.List;

import com.dao.CompanyDao;
import com.po.Company;

public class CompanyService {
	private CompanyDao companyDao;
	public List<Company> queryCompanyByName(String cname){
		return companyDao.queryCompanyByName(cname);
	}
	public List<Company> queryCompanyByAddress(String province,String city,String county,String street){
		return companyDao.queryCompanyByAddress(province, city, county, street);
	}
	public List<Company> getAllCompany(){
		return companyDao.getAllCompany();
	}
	public Company getCompany(int cid){
		return companyDao.getCompany(cid);
	}
	public void updateCompany(Company company) {
		companyDao.updateCompany(company);
	}
	public void deleteCompany(int cid){
		companyDao.deleteCompany(cid);
	}
	public void addCompany(Company company){
		companyDao.addCompany(company);
	}

	public CompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}
	

}
