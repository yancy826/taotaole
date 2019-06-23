package com.taotaole.model;

import java.util.Date;
/**
 * @author 颜超一
* <p>Trade 类的简述.<br>
* 用户的实体类<br>
* 涉及的私有变量有id、用户名、密码、生日、性别、电话号码、个性签名<br>
* 使用get和set方法对私有变量进行访问和设置
*/
public class User {
	
	private int id;
	private String username;
	private String password;
	private Date birthday;
	private String sex; 
	private String telephoneNumber;
	private String personalitySignature;//个性签名
	
	/**
	* getId 方法的简述.
	* <p>使用get方法获取私有变量id的值<br>
	* @return id 返回id的值
	*/
	public int getId() {
		return id;
	}
	
	/**
	* setId 方法的简述.
	* <p>使用set方法设置私有变量id的值<br>
	* @param id 表示id
	*/
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	* getUsername 方法的简述.
	* <p>使用get方法获取私有变量username的值<br>
	* @return username 返回username的值
	*/
	public String getUsername() {
		return username;
	}
	
	/**
	* setUsername 方法的简述.
	* <p>使用set方法设置私有变量username的值<br>
	* @param username 表示用户名
	*/
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	* getPassword 方法的简述.
	* <p>使用get方法获取私有变量password的值<br>
	* @return password 返回password的值
	*/
	public String getPassword() {
		return password;
	}
	
	/**
	* setPassword 方法的简述.
	* <p>使用set方法设置私有变量password的值<br>
	* @param password 表示密码
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	* getBirthday 方法的简述.
	* <p>使用get方法获取私有变量birthday的值<br>
	* @return birthday 返回birthday的值
	*/
	public Date getBirthday() {
		return birthday;
	}
	
	/**
	* setBirthday 方法的简述.
	* <p>使用set方法设置私有变量birthday的值<br>
	* @param birthday 表示生日
	*/
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	/**
	* getSex 方法的简述.
	* <p>使用get方法获取私有变量sex的值<br>
	* @return sex 返回sex的值
	*/
	public String getSex() {
		return sex;
	}
	
	/**
	* setSex 方法的简述.
	* <p>使用set方法设置私有变量sex的值<br>
	* @param sex 表示性别
	*/
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	* getTelephoneNumber 方法的简述.
	* <p>使用get方法获取私有变量telephoneNumber的值<br>
	* @return telephoneNumber 返回telephoneNumber的值
	*/
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	/**
	* setTelephoneNumber方法的简述.
	* <p>使用set方法设置私有变量telephoneNumber的值<br>
	* @param telephoneNumber 表示电话号码
	*/
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	/**
	* getPersonalitySignature 方法的简述.
	* <p>使用get方法获取私有变量personalitySignature的值<br>
	* @return personalitySignature 返回personalitySignature的值
	*/
	public String getPersonalitySignature() {
		return personalitySignature;
	}
	
	/**
	* setPersonalitySignature方法的简述.
	* <p>使用set方法设置私有变量personalitySignature的值<br>
	* @param personalitySignature 表示个性签名
	*/
	public void setPersonalitySignature(String personalitySignature) {
		this.personalitySignature = personalitySignature;
	}
	
	
}
