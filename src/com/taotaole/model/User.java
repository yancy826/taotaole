package com.taotaole.model;

import java.util.Date;

public class User {
	
	private int id;
	private String username;
	private String password;
	private Date birthday;
	private String sex; 
	private String telephoneNumber;
	private String personalitySignature;//¸öÐÔÇ©Ãû
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getPersonalitySignature() {
		return personalitySignature;
	}
	public void setPersonalitySignature(String personalitySignature) {
		this.personalitySignature = personalitySignature;
	}
	
	
}
