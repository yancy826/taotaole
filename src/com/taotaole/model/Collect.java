package com.taotaole.model;

import java.io.Serializable;
/**
 * @author 颜超一
* <p>Collect 类的简述.<br>
* 收藏记录的实体类<br>
* 涉及的私有变量有id、卖家、买家、书名、品相、金额<br>
* 使用get和set方法对私有变量进行访问和设置
*/
public class Collect implements Serializable{
	
	private int id;
	private String sellerName;//卖家
	private String buyerName;//买家
	private String bookName;//书名
	private String phase;//品相
	private double amount;//金额
	
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
	* getPhase 方法的简述.
	* <p>使用get方法获取私有变量phase的值<br>
	* @return phase 返回phase的值
	*/
	public String getPhase() {
		return phase;
	}
	
	/**
	* setPhase 方法的简述.
	* <p>使用set方法设置私有变量phase的值<br>
	* @param phase 表示品相
	*/
	public void setPhase(String phase) {
		this.phase = phase;
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
	* @param amount 表示金额
	*/
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
