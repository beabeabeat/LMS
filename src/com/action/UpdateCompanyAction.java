package com.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Company;
import com.service.CompanyService;

public class UpdateCompanyAction extends ActionSupport{
	CompanyService companyService;
	private int cid;
	private String cname;
	private String header;
	private String headerPhone;
	private String companyPhone;
	private String province;
	private String city;
	private String county;
	private String street;
	private String zone;
	public String updateCompany(){
		cid=Integer.parseInt(ServletActionContext.getRequest().getParameter("id").toString());
		Company company=new Company(cid, cname, header, headerPhone, companyPhone, province, city, county, street, zone);
		companyService.updateCompany(company);
		return "success";
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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getHeaderPhone() {
		return headerPhone;
	}
	public void setHeaderPhone(String headerPhone) {
		this.headerPhone = headerPhone;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
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
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	

}
