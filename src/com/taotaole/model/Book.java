package com.taotaole.model;

import java.io.Serializable;
import java.util.Date;
/**
 * @author 颜超一
* <p>Book 类的简述<br>
* 书籍的实体类<br>
* 涉及的私有变量有id、书名、作者、上架时间、装帧、原价、现价等<br>
* 使用get和set方法对私有变量进行访问和设置
*/
public class Book implements Serializable{
	
	private int id;
	private String bookName;//书名
	private String author;//作者
	private Date  groundingTime;//上架时间
	private String binding;//装帧
	private double originalCost;//原价
	private double currentCost;//现价
	private String press;//出版社
	private Date pressTime;//出版时间
	private String phase;//品相
	private String bookSize;//开本
	private int pageNum;//页数
	private String grade;//年级
	private String profession;//专业
	private String ownerName;//卖家
	private String image;//图片
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	/**
	* getOwnerName 方法的简述.
	* <p>使用get方法获取私有变量ownerName的值<br>
	* @return ownerName 返回卖家名
	*/
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	* setOwnerName 方法的简述.
	* <p>使用set方法设置私有变量ownerName的值<br>
	* @param ownerName 表示新的卖家名
	*/
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	/**
	* getId 方法的简述.
	* <p>使用get方法获取私有变量id的值<br>
	* @return id 返回id值
	*/
	public int getId() {
		return id;
	}
	
	/**
	* setId 方法的简述.
	* <p>使用set方法设置私有变量ownerName的值<br>
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
	* <p>使用set方法设置私有变量ownerName的值<br>
	* @param bookName 表示书名
	*/
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	/**
	* getAuthor 方法的简述.
	* <p>使用get方法获取私有变量author的值<br>
	* @return author 返回author的值
	*/
	public String getAuthor() {
		return author;
	}
	
	/**
	* setAuthor 方法的简述.
	* <p>使用set方法设置私有变量author的值<br>
	* @param author 表示作者
	*/
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	* getGroundingTime 方法的简述.
	* <p>使用get方法获取私有变量groundingTime的值<br>
	* @return groundingTime 返回groundingTime的值
	*/
	public Date getGroundingTime() {
		return groundingTime;
	}
	
	/**
	* setGroundingTime 方法的简述.
	* <p>使用set方法设置私有变量groundingTime的值<br>
	* @param groundingTime 表示出版时间
	*/
	public void setGroundingTime(Date groundingTime) {
		this.groundingTime = groundingTime;
	}
	
	/**
	* getBinding 方法的简述.
	* <p>使用get方法获取私有变量binding的值<br>
	* @return binding 返回binding的值
	*/
	public String getBinding() {
		return binding;
	}
	
	/**
	* setBinding 方法的简述.
	* <p>使用set方法设置私有变量binding的值<br>
	* @param binding 表示装帧
	*/
	public void setBinding(String binding) {
		this.binding = binding;
	}
	
	/**
	* getOriginalCost 方法的简述.
	* <p>使用get方法获取私有变量originalCost的值<br>
	* @return originalCost 返回originalCost的值
	*/
	public double getOriginalCost() {
		return originalCost;
	}
	
	/**
	* setOriginalCost 方法的简述.
	* <p>使用set方法设置私有变量originalCost的值<br>
	* @param originalCost 表示原价
	*/
	public void setOriginalCost(double originalCost) {
		this.originalCost = originalCost;
	}
	
	/**
	* getCurrentCost 方法的简述.
	* <p>使用get方法获取私有变量currentCost的值<br>
	* @return currentCost 返回currentCost的值
	*/
	public double getCurrentCost() {
		return currentCost;
	}
	
	/**
	* setCurrentCost 方法的简述.
	* <p>使用set方法设置私有变量currentCost的值<br>
	* @param currentCost 表示现价
	*/
	public void setCurrentCost(double currentCost) {
		this.currentCost = currentCost;
	}
	
	/**
	* getPress 方法的简述.
	* <p>使用get方法获取私有变量press的值<br>
	* @return press 返回press的值
	*/
	public String getPress() {
		return press;
	}
	
	/**
	* setPress 方法的简述.
	* <p>使用set方法设置私有变量press的值<br>
	* @param press 表示出版社
	*/
	public void setPress(String press) {
		this.press = press;
	}
	
	/**
	* getPressTime 方法的简述.
	* <p>使用get方法获取私有变量pressTime的值<br>
	* @return pressTime 返回pressTime的值
	*/
	public Date getPressTime() {
		return pressTime;
	}
	
	/**
	* setPressTime 方法的简述.
	* <p>使用set方法设置私有变量pressTime的值<br>
	* @param pressTime 表示出版时间
	*/
	public void setPressTime(Date pressTime) {
		this.pressTime = pressTime;
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
	* getBookSize 方法的简述.
	* <p>使用get方法获取私有变量bookSize的值<br>
	* @return bookSize 返回bookSize的值
	*/
	public String getBookSize() {
		return bookSize;
	}
	
	/**
	* setBookSize 方法的简述.
	* <p>使用set方法设置私有变量bookSize的值<br>
	* @param bookSize 表示开本
	*/
	public void setBookSize(String bookSize) {
		this.bookSize = bookSize;
	}
	
	/**
	* getPageNum 方法的简述.
	* <p>使用get方法获取私有变量pageNum的值<br>
	* @return pageNum 返回pageNum的值
	*/
	public int getPageNum() {
		return pageNum;
	}
	
	/**
	* setPageNum 方法的简述.
	* <p>使用set方法设置私有变量pageNum的值<br>
	* @param pageNum 表示页数
	*/
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	/**
	* getGrade 方法的简述.
	* <p>使用get方法获取私有变量grade的值<br>
	* @return grade 返回grade的值
	*/
	public String getGrade() {
		return grade;
	}
	
	/**
	* setGrade 方法的简述.
	* <p>使用set方法设置私有变量grade的值<br>
	* @param grade 表示年级
	*/
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	/**
	* getProfession 方法的简述.
	* <p>使用get方法获取私有变量profession的值<br>
	* @return profession 返回profession的值
	*/
	public String getProfession() {
		return profession;
	}
	
	/**
	* setProfession 方法的简述.
	* <p>使用set方法设置私有变量profession的值<br>
	* @param profession 表示专业
	*/
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	/**
	* toString 方法的简述.
	* <p>@param String 返回书籍信息的字符串
	*/
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author  
				 + "]";
	}
	
}
