package com.niit.skillmapping.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class User {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	
	@NotEmpty(message="Name is required")
	private String fname;
	
	@NotEmpty(message="Name is required")
	private String lname;
	
	@NotEmpty(message="Number is required")
	//@Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")
	private String email_id;
	
	@NotEmpty(message="phone number is required")
	//@Pattern(regexp = "\\d{10}")
	private String phone_number;
	
	@NotEmpty(message="Password needs to be set")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z]).{8,}$")
	private String password;
	private Date date_of_birth;
	private boolean status = false;
	private int manager_id;
	
	public User() {
		
	}
	
	public User(int user_id, String fname, String lname, String email_id, String phone_number, String password,
			Date date_of_birth, boolean status, int manager_id) {
		this.user_id = user_id;
		this.fname = fname;
		this.lname = lname;
		this.email_id = email_id;
		this.phone_number = phone_number;
		this.password = password;
		this.date_of_birth = date_of_birth;
		this.status = status;
		this.manager_id = manager_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}	

}
