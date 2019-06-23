package com.taotaole.model;

import java.io.Serializable;
import java.util.Date;
/**
 * @author �ճ�һ
* <p>Book ��ļ���<br>
* �鼮��ʵ����<br>
* �漰��˽�б�����id�����������ߡ��ϼ�ʱ�䡢װ֡��ԭ�ۡ��ּ۵�<br>
* ʹ��get��set������˽�б������з��ʺ�����
*/
public class Book implements Serializable{
	
	private int id;
	private String bookName;//����
	private String author;//����
	private Date  groundingTime;//�ϼ�ʱ��
	private String binding;//װ֡
	private double originalCost;//ԭ��
	private double currentCost;//�ּ�
	private String press;//������
	private Date pressTime;//����ʱ��
	private String phase;//Ʒ��
	private String bookSize;//����
	private int pageNum;//ҳ��
	private String grade;//�꼶
	private String profession;//רҵ
	private String ownerName;//����
	private String image;//ͼƬ
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	/**
	* getOwnerName �����ļ���.
	* <p>ʹ��get������ȡ˽�б���ownerName��ֵ<br>
	* @return ownerName ����������
	*/
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	* setOwnerName �����ļ���.
	* <p>ʹ��set��������˽�б���ownerName��ֵ<br>
	* @param ownerName ��ʾ�µ�������
	*/
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	/**
	* getId �����ļ���.
	* <p>ʹ��get������ȡ˽�б���id��ֵ<br>
	* @return id ����idֵ
	*/
	public int getId() {
		return id;
	}
	
	/**
	* setId �����ļ���.
	* <p>ʹ��set��������˽�б���ownerName��ֵ<br>
	* @param id ��ʾid
	*/
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	* getBookName �����ļ���.
	* <p>ʹ��get������ȡ˽�б���bookName��ֵ<br>
	* @return bookName ����bookName��ֵ
	*/
	public String getBookName() {
		return bookName;
	}
	
	/**
	* setBookName �����ļ���.
	* <p>ʹ��set��������˽�б���ownerName��ֵ<br>
	* @param bookName ��ʾ����
	*/
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	/**
	* getAuthor �����ļ���.
	* <p>ʹ��get������ȡ˽�б���author��ֵ<br>
	* @return author ����author��ֵ
	*/
	public String getAuthor() {
		return author;
	}
	
	/**
	* setAuthor �����ļ���.
	* <p>ʹ��set��������˽�б���author��ֵ<br>
	* @param author ��ʾ����
	*/
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	* getGroundingTime �����ļ���.
	* <p>ʹ��get������ȡ˽�б���groundingTime��ֵ<br>
	* @return groundingTime ����groundingTime��ֵ
	*/
	public Date getGroundingTime() {
		return groundingTime;
	}
	
	/**
	* setGroundingTime �����ļ���.
	* <p>ʹ��set��������˽�б���groundingTime��ֵ<br>
	* @param groundingTime ��ʾ����ʱ��
	*/
	public void setGroundingTime(Date groundingTime) {
		this.groundingTime = groundingTime;
	}
	
	/**
	* getBinding �����ļ���.
	* <p>ʹ��get������ȡ˽�б���binding��ֵ<br>
	* @return binding ����binding��ֵ
	*/
	public String getBinding() {
		return binding;
	}
	
	/**
	* setBinding �����ļ���.
	* <p>ʹ��set��������˽�б���binding��ֵ<br>
	* @param binding ��ʾװ֡
	*/
	public void setBinding(String binding) {
		this.binding = binding;
	}
	
	/**
	* getOriginalCost �����ļ���.
	* <p>ʹ��get������ȡ˽�б���originalCost��ֵ<br>
	* @return originalCost ����originalCost��ֵ
	*/
	public double getOriginalCost() {
		return originalCost;
	}
	
	/**
	* setOriginalCost �����ļ���.
	* <p>ʹ��set��������˽�б���originalCost��ֵ<br>
	* @param originalCost ��ʾԭ��
	*/
	public void setOriginalCost(double originalCost) {
		this.originalCost = originalCost;
	}
	
	/**
	* getCurrentCost �����ļ���.
	* <p>ʹ��get������ȡ˽�б���currentCost��ֵ<br>
	* @return currentCost ����currentCost��ֵ
	*/
	public double getCurrentCost() {
		return currentCost;
	}
	
	/**
	* setCurrentCost �����ļ���.
	* <p>ʹ��set��������˽�б���currentCost��ֵ<br>
	* @param currentCost ��ʾ�ּ�
	*/
	public void setCurrentCost(double currentCost) {
		this.currentCost = currentCost;
	}
	
	/**
	* getPress �����ļ���.
	* <p>ʹ��get������ȡ˽�б���press��ֵ<br>
	* @return press ����press��ֵ
	*/
	public String getPress() {
		return press;
	}
	
	/**
	* setPress �����ļ���.
	* <p>ʹ��set��������˽�б���press��ֵ<br>
	* @param press ��ʾ������
	*/
	public void setPress(String press) {
		this.press = press;
	}
	
	/**
	* getPressTime �����ļ���.
	* <p>ʹ��get������ȡ˽�б���pressTime��ֵ<br>
	* @return pressTime ����pressTime��ֵ
	*/
	public Date getPressTime() {
		return pressTime;
	}
	
	/**
	* setPressTime �����ļ���.
	* <p>ʹ��set��������˽�б���pressTime��ֵ<br>
	* @param pressTime ��ʾ����ʱ��
	*/
	public void setPressTime(Date pressTime) {
		this.pressTime = pressTime;
	}
	
	/**
	* getPhase �����ļ���.
	* <p>ʹ��get������ȡ˽�б���phase��ֵ<br>
	* @return phase ����phase��ֵ
	*/
	public String getPhase() {
		return phase;
	}
	
	/**
	* setPhase �����ļ���.
	* <p>ʹ��set��������˽�б���phase��ֵ<br>
	* @param phase ��ʾƷ��
	*/
	public void setPhase(String phase) {
		this.phase = phase;
	}
	
	/**
	* getBookSize �����ļ���.
	* <p>ʹ��get������ȡ˽�б���bookSize��ֵ<br>
	* @return bookSize ����bookSize��ֵ
	*/
	public String getBookSize() {
		return bookSize;
	}
	
	/**
	* setBookSize �����ļ���.
	* <p>ʹ��set��������˽�б���bookSize��ֵ<br>
	* @param bookSize ��ʾ����
	*/
	public void setBookSize(String bookSize) {
		this.bookSize = bookSize;
	}
	
	/**
	* getPageNum �����ļ���.
	* <p>ʹ��get������ȡ˽�б���pageNum��ֵ<br>
	* @return pageNum ����pageNum��ֵ
	*/
	public int getPageNum() {
		return pageNum;
	}
	
	/**
	* setPageNum �����ļ���.
	* <p>ʹ��set��������˽�б���pageNum��ֵ<br>
	* @param pageNum ��ʾҳ��
	*/
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	/**
	* getGrade �����ļ���.
	* <p>ʹ��get������ȡ˽�б���grade��ֵ<br>
	* @return grade ����grade��ֵ
	*/
	public String getGrade() {
		return grade;
	}
	
	/**
	* setGrade �����ļ���.
	* <p>ʹ��set��������˽�б���grade��ֵ<br>
	* @param grade ��ʾ�꼶
	*/
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	/**
	* getProfession �����ļ���.
	* <p>ʹ��get������ȡ˽�б���profession��ֵ<br>
	* @return profession ����profession��ֵ
	*/
	public String getProfession() {
		return profession;
	}
	
	/**
	* setProfession �����ļ���.
	* <p>ʹ��set��������˽�б���profession��ֵ<br>
	* @param profession ��ʾרҵ
	*/
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	/**
	* toString �����ļ���.
	* <p>@param String �����鼮��Ϣ���ַ���
	*/
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author  
				 + "]";
	}
	
}
