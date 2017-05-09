package com.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.service.internal.ProvidedService;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Company;
import com.service.CompanyService;

public class QueryCompanyAction extends ActionSupport{
	private String cname;
	private String province;
	private String city;
	private String county;
	private String street;
	CompanyService companyService;
	List<Company> list;
	
	public String queryCompanyByAddress(){
		list=companyService.queryCompanyByAddress(province, city, county, street);
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("queryCompanies", list);
		return "success";
	}
	public String queryCompanyByName(){
		list=companyService.queryCompanyByName(cname);
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("queryCompanies", list);
		return "success";
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	

}
