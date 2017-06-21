package com.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Company;
import com.service.CompanyService;

public class ShowCompanyListAction extends ActionSupport{
	CompanyService companyService;
	List<Company> list;
	public String showCompanyList(){
		list=companyService.getAllCompany();
		HttpSession session=ServletActionContext.getRequest().getSession();
	    session.setAttribute("companyList",list); 
	        return "success";	
	}
	public CompanyService getCompanyService() {
		return companyService;
	}
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}
	public List<Company> getList() {
		return list;
	}
	public void setList(List<Company> list) {
		this.list = list;
	}
	

}
