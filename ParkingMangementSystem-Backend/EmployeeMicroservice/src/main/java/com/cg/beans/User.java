
 
package com.cg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="USER_MASTER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Id")
	private Integer UserId;
	
	@Column(name="User_Name")
	private String UserName;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Role")
	private String role;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer UserId, String UserName, String password, String role) {
		super();
		this.UserId = UserId;
		this.UserName = UserName;
		this.password = password;
		this.role = role;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer UserId) {
		this.UserId = UserId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
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
	
	
}