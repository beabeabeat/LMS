package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Company;
import com.service.CompanyService;

public class UpdateCompanyRedirectAction extends ActionSupport{
	public Company c;
	public CompanyService companyService;
	private int cid;
	public String updateRedirectCompany(){
		c=companyService.getCompany(cid);
		return "success";
	}
	public Company getC() {
		return c;
	}
	public void setC(Company c) {
		this.c = c;
	}
	public CompanyService getCompanyService() {
		return companyService;
	}
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	

}
