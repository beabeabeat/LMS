package com.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LogOutAction extends ActionSupport{
	public String logOut() {
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.invalidate();
		return "success";
	}

}
