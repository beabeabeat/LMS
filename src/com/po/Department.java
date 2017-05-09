package com.po;

import java.io.Serializable;

public class Department implements Serializable{
	private int did;
	private String dname;
	
	public Department() {
		super();
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Department(String dname) {
		super();
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	

}
