package com.loginuser.loginuser.Dto;

import java.util.Date;

import jakarta.persistence.Column;

public class UserDTO {

	private long usern;
	
	private String fullname;
	
	private String email;
	
	private String password;
	
	private String role;
	
	private Date loginDate;
	
	private Date loginTime;
	
	private Date logoutTime;
	

	public UserDTO(long usern, String fullname, String email, String password,String role,Date loginDate, Date logoutTime, Date loginTime) {
		this.usern = usern;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.role=role;
		this.setLoginDate(loginDate);
		this.loginTime=loginTime;
		this.logoutTime=logoutTime;
	} 

	public long getUsern() {
		return usern;
	}

	public void setUsern(long usern) {
		this.usern = usern;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserDTO(){
		
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	
	
	
	
}
