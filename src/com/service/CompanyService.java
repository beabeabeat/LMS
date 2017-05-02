package com.service;

import java.util.List;

import com.dao.CompanyDao;
import com.po.Company;

public class CompanyService {
	private CompanyDao companyDao;
	public List<Company> getAllCompany(){
		return companyDao.getAllCompany();
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
