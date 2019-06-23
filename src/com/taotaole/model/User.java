package com.taotaole.model;

import java.util.Date;
/**
 * @author �ճ�һ
* <p>Trade ��ļ���.<br>
* �û���ʵ����<br>
* �漰��˽�б�����id���û��������롢���ա��Ա𡢵绰���롢����ǩ��<br>
* ʹ��get��set������˽�б������з��ʺ�����
*/
public class User {
	
	private int id;
	private String username;
	private String password;
	private Date birthday;
	private String sex; 
	private String telephoneNumber;
	private String personalitySignature;//����ǩ��
	
	/**
	* getId �����ļ���.
	* <p>ʹ��get������ȡ˽�б���id��ֵ<br>
	* @return id ����id��ֵ
	*/
	public int getId() {
		return id;
	}
	
	/**
	* setId �����ļ���.
	* <p>ʹ��set��������˽�б���id��ֵ<br>
	* @param id ��ʾid
	*/
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	* getUsername �����ļ���.
	* <p>ʹ��get������ȡ˽�б���username��ֵ<br>
	* @return username ����username��ֵ
	*/
	public String getUsername() {
		return username;
	}
	
	/**
	* setUsername �����ļ���.
	* <p>ʹ��set��������˽�б���username��ֵ<br>
	* @param username ��ʾ�û���
	*/
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	* getPassword �����ļ���.
	* <p>ʹ��get������ȡ˽�б���password��ֵ<br>
	* @return password ����password��ֵ
	*/
	public String getPassword() {
		return password;
	}
	
	/**
	* setPassword �����ļ���.
	* <p>ʹ��set��������˽�б���password��ֵ<br>
	* @param password ��ʾ����
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	* getBirthday �����ļ���.
	* <p>ʹ��get������ȡ˽�б���birthday��ֵ<br>
	* @return birthday ����birthday��ֵ
	*/
	public Date getBirthday() {
		return birthday;
	}
	
	/**
	* setBirthday �����ļ���.
	* <p>ʹ��set��������˽�б���birthday��ֵ<br>
	* @param birthday ��ʾ����
	*/
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	/**
	* getSex �����ļ���.
	* <p>ʹ��get������ȡ˽�б���sex��ֵ<br>
	* @return sex ����sex��ֵ
	*/
	public String getSex() {
		return sex;
	}
	
	/**
	* setSex �����ļ���.
	* <p>ʹ��set��������˽�б���sex��ֵ<br>
	* @param sex ��ʾ�Ա�
	*/
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	* getTelephoneNumber �����ļ���.
	* <p>ʹ��get������ȡ˽�б���telephoneNumber��ֵ<br>
	* @return telephoneNumber ����telephoneNumber��ֵ
	*/
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	/**
	* setTelephoneNumber�����ļ���.
	* <p>ʹ��set��������˽�б���telephoneNumber��ֵ<br>
	* @param telephoneNumber ��ʾ�绰����
	*/
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	/**
	* getPersonalitySignature �����ļ���.
	* <p>ʹ��get������ȡ˽�б���personalitySignature��ֵ<br>
	* @return personalitySignature ����personalitySignature��ֵ
	*/
	public String getPersonalitySignature() {
		return personalitySignature;
	}
	
	/**
	* setPersonalitySignature�����ļ���.
	* <p>ʹ��set��������˽�б���personalitySignature��ֵ<br>
	* @param personalitySignature ��ʾ����ǩ��
	*/
	public void setPersonalitySignature(String personalitySignature) {
		this.personalitySignature = personalitySignature;
	}
	
	
}
