package com.po;

import java.io.Serializable;

public class Role implements Serializable{
	private int rid;
	private String rname;
	//х╗оч
	private String admin;
	private String receive;
	private String ticket;
	private String delivery;
	private String finance;
	private String business;
	private String data;
	private String manager;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getReceive() {
		return receive;
	}
	public void setReceive(String receive) {
		this.receive = receive;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getFinance() {
		return finance;
	}
	public void setFinance(String finance) {
		this.finance = finance;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	

}
