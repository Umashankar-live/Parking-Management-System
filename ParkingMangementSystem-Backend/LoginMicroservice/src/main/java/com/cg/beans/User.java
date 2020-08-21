
package com.cg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_MASTER")
public class User {
	@Id
	@Column(name = "User_Id")
	private Integer userId;

	@Column(name = "User_Name")
	private String userName;

	@Column(name = "Password")
	private String password;

	@Column(name = "Role")
	private String role;

	@Column(name = "Email_Id")
	private String email;

	@Column(name = "Phone_No")
	private String phoneNo;

	@Column(name = "Gender")
	private String gender;

	public User() {
		
	}

	public User(Integer userId, String userName, String password, String role, String email, String phoneNo,
			String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.email = email;
		this.phoneNo = phoneNo;
		this.gender = gender;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
