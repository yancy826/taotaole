package com.taotaole.model;

import java.io.Serializable;
import java.util.Date;
/**
 * @author 颜超一
* <p>Trade 类的简述.<br>
* 交易记录的实体类<br>
* 涉及的私有变量有id、书名、卖家名、买家名、交易金额、时间<br>
* 使用get和set方法对私有变量进行访问和设置
*/
public class Trade implements Serializable{
	
	private int id;
	private String bookName;
	private String sellerName;//卖家名
	private String buyerName;//买家名
	private double amount;
	private Date time;
	
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
	* getBookName 方法的简述.
	* <p>使用get方法获取私有变量bookName的值<br>
	* @return bookName 返回bookName的值
	*/
	public String getBookName() {
		return bookName;
	}
	
	/**
	* setBookName 方法的简述.
	* <p>使用set方法设置私有变量bookName的值<br>
	* @param bookName 表示书名
	*/
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	/**
	* getSellerName 方法的简述.
	* <p>使用get方法获取私有变量sellerName的值<br>
	* @return sellerName 返回sellerName的值
	*/
	public String getSellerName() {
		return sellerName;
	}
	
	/**
	* setSellerName 方法的简述.
	* <p>使用set方法设置私有变量sellerName的值<br>
	* @param sellerName 表示卖家名
	*/
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	/**
	* getBuyerName 方法的简述.
	* <p>使用get方法获取私有变量buyerName的值<br>
	* @return buyerName 返回buyerName的值
	*/
	public String getBuyerName() {
		return buyerName;
	}
	
	/**
	* setBuyerName 方法的简述.
	* <p>使用set方法设置私有变量buyerName的值<br>
	* @param buyerName 表示买家名
	*/
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	/**
	* getAmount 方法的简述.
	* <p>使用get方法获取私有变量amount的值<br>
	* @return amount 返回amount的值
	*/
	public double getAmount() {
		return amount;
	}
	
	/**
	* setAmount 方法的简述.
	* <p>使用set方法设置私有变量amount的值<br>
	* @param amount 表示交易金额
	*/
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	* getTime 方法的简述.
	* <p>使用get方法获取私有变量time的值<br>
	* @return time 返回time的值
	*/
	public Date getTime() {
		return time;
	}
	
	/**
	* setTime 方法的简述.
	* <p>使用set方法设置私有变量time的值<br>
	* @param time 表示交易时间
	*/
	public void setTime(Date time) {
		this.time = time;
	}
	
}
