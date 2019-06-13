package com.taotaole.model;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable{
	
	private int id;
	private String bookName;
	private String author;
	private Date  groundingTime;//上架时间
	private String binding;//装帧
	private double originalCost;
	private double currentCost;
	private String press;//出版社
	private Date pressTime;//出版时间
	private String phase;//品相
	private String bookSize;//开本
	private int pageNum;//页数
	private String grade;//年级
	private String profession;//专业
	private String ownerName;
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getGroundingTime() {
		return groundingTime;
	}
	public void setGroundingTime(Date groundingTime) {
		this.groundingTime = groundingTime;
	}
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public double getOriginalCost() {
		return originalCost;
	}
	public void setOriginalCost(double originalCost) {
		this.originalCost = originalCost;
	}
	public double getCurrentCost() {
		return currentCost;
	}
	public void setCurrentCost(double currentCost) {
		this.currentCost = currentCost;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public Date getPressTime() {
		return pressTime;
	}
	public void setPressTime(Date pressTime) {
		this.pressTime = pressTime;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public String getBookSize() {
		return bookSize;
	}
	public void setBookSize(String bookSize) {
		this.bookSize = bookSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author  
				 + "]";
	}
	
}
