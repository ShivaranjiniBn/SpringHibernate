package com.jsp.MyDatabase.dto;

import org.springframework.stereotype.Component;

@Component
public class UpdateDataSourceDTO 
{
	private String portnumber;
	private String username;
	private String password;
	private int altkey;
	
	public String getPortnumber() {
		return portnumber;
	}
	public void setPortnumber(String portnumber) {
		this.portnumber = portnumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAltkey() {
		return altkey;
	}
	public void setAltkey(int altkey) {
		this.altkey = altkey;
	}
	
	
	
}
