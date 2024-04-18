package com.loginuser.loginuser.Entity;


import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "user", uniqueConstraints = {
	    @UniqueConstraint(columnNames = "email")
	})
public class User {
	
	@Id
	@Column(name="user_name",length=50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long usern;
	
	@Column(name="fullname",length=255)
	private String fullname;
	
	@Column(name="email",length=255)
	private String email;
	
	@Column(name="password",length=255)
	private String password;
	
	@Column(name="role",length=255)
	private String role;
	
	
    @Column(name = "logindate")
    private Date logindate;
	
	@Column(name = "logintime")
    private Date logintime;
	
	@Column(name = "logouttime")
    private LocalDate logouttime;
	
	public User(long usern, String fullname, String email, String password,String role, Date logindate, Date logintime, LocalDate logouttime) {
		this.usern = usern;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.role=role;
		this.logindate=logindate;
		this.logintime=logintime;
		this.logouttime=logouttime;
		
	} 
	 
	
	
	public User() {
		
	}

	public long getUsern() {
		return usern;
	}

	public void setUsern(long usernam) {
		this.usern = usernam;
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


	@Override
	public String toString() {
		return "User [usern=" + usern + ", fullname=" + fullname + ", email=" + email + ", password=" + password +", role=" + role +", loginTime=" + logintime + ", logoutTime=" + logouttime +", loginDate=" + logindate + "]";
	}



	public Date getLogindate() {
		return logindate;
	}



	public void setLogindate(Date date) {
		this.logindate = date;
	}



	public Date getLogintime() {
		return logintime;
	}



	public void setLogintime(Date date) {
		this.logintime = date;
	}



	public LocalDate getLogouttime() {
		return logouttime;
	}



	public void setLogouttime(LocalDate logouttime) {
		this.logouttime = logouttime;
	}




}
