package com.jsp.MyDatabase.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="data_source_master")
@Entity
public class DataSourceEntity  implements Serializable{
	@Id
	@Column(name="alt_key")
	private int altkey;
	
	
	@Column(name="db_name")
	private String dbname;
	
	
	@Column(name="port_number")
	private String portNumber;
	
	
	@Column(name="user_name")
	private String userName;
	
	
	@Column(name="password")
	private String password;
	
	
	@Column(name="host_name")
	private String hostname;
	
	
	@Column(name="modified_date")
	private Date modifiedDate;
	
	public int getAltkey() {
		return altkey;
	}

	public void setAltkey(int altkey) {
		this.altkey = altkey;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public void setCreatedDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "DataSourceEntity [altkey=" + altkey + ", dbname=" + dbname + ", portNumber=" + portNumber
				+ ", userName=" + userName + ", password=" + password + ", hostname=" + hostname + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	

}
