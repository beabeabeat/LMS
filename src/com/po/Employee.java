package com.po;

import java.io.Serializable;

public class Employee implements Serializable{
	private int eid;
	private String ename;
	private String realName;
	private String password;
	private String phoneNumber;
	private String company;
	private String department;
	private int eState; //0代表离职，1代表在职，2代表请假
	private int roleID;
	private String regTime;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String ename, String realName, String password, String phoneNumber, String company,
			String department, int eState, int roleID) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.realName = realName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.company = company;
		this.department = department;
		this.eState = eState;
		this.roleID = roleID;
	}

	public Employee(String ename, String realName, String password, String phoneNumber, String company,
			String department, int eState, int roleID) {
		super();
		this.ename = ename;
		this.realName = realName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.company = company;
		this.department = department;
		this.eState = eState;
		this.roleID = roleID;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public int geteState() {
		return eState;
	}
	public void seteState(int eState) {
		this.eState = eState;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	
	
	

	
	
}
