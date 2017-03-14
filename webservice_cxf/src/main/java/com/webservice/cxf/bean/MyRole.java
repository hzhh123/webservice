package com.webservice.cxf.bean;

import java.util.List;

public class MyRole {
	private String key;
	private List<Role>roles;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
