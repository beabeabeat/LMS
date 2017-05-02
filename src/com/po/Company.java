package com.po;

import java.io.Serializable;

public class Company implements Serializable{
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
	
	public Company(){
		super();
	}
	public Company(String cname, String header, String headerPhone, String companyPhone, String province, String city,
			String county, String street, String zone) {
		super();
		this.cname = cname;
		this.header = header;
		this.headerPhone = headerPhone;
		this.companyPhone = companyPhone;
		this.province = province;
		this.city = city;
		this.county = county;
		this.street = street;
		this.zone = zone;
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
