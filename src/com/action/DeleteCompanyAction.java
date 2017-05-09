package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Company;
import com.service.CompanyService;

public class DeleteCompanyAction extends ActionSupport{
	private int cid;
	CompanyService companyService;
	public String deleteCompany(){
		companyService.deleteCompany(cid);
		return "success";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public CompanyService getCompanyService() {
		return companyService;
	}
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}
	
}
