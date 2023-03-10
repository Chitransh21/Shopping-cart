package com.shipcart.model;

public class User {
   
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private String mobile;
	
	
	
	public User() {
		
	}



	public User(int id, String fname, String lname, String email, String pass, String mobile) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass
				+ ", mobile=" + mobile + "]";
	}
	
	
	
	
}
