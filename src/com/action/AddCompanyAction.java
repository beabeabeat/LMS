package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Company;
import com.service.CompanyService;

public class AddCompanyAction extends ActionSupport{
	CompanyService companyService;
	private String cname;
	private String header;
	private String headerPhone;
	private String companyPhone;
	private String province;
	private String city;
	private String county;
	private String street;
	private String zone;
	
	public String addCompany(){
	Company company=new Company(cname,header,headerPhone,companyPhone,province,city,county,street,zone);
	companyService.addCompany(company);
	return "success";
	}
	

}
