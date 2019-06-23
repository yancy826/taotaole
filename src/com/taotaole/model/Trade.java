package com.taotaole.model;

import java.io.Serializable;
import java.util.Date;
/**
 * @author �ճ�һ
* <p>Trade ��ļ���.<br>
* ���׼�¼��ʵ����<br>
* �漰��˽�б�����id��������������������������׽�ʱ��<br>
* ʹ��get��set������˽�б������з��ʺ�����
*/
public class Trade implements Serializable{
	
	private int id;
	private String bookName;
	private String sellerName;//������
	private String buyerName;//�����
	private double amount;
	private Date time;
	
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
	* getBookName �����ļ���.
	* <p>ʹ��get������ȡ˽�б���bookName��ֵ<br>
	* @return bookName ����bookName��ֵ
	*/
	public String getBookName() {
		return bookName;
	}
	
	/**
	* setBookName �����ļ���.
	* <p>ʹ��set��������˽�б���bookName��ֵ<br>
	* @param bookName ��ʾ����
	*/
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	/**
	* getSellerName �����ļ���.
	* <p>ʹ��get������ȡ˽�б���sellerName��ֵ<br>
	* @return sellerName ����sellerName��ֵ
	*/
	public String getSellerName() {
		return sellerName;
	}
	
	/**
	* setSellerName �����ļ���.
	* <p>ʹ��set��������˽�б���sellerName��ֵ<br>
	* @param sellerName ��ʾ������
	*/
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	/**
	* getBuyerName �����ļ���.
	* <p>ʹ��get������ȡ˽�б���buyerName��ֵ<br>
	* @return buyerName ����buyerName��ֵ
	*/
	public String getBuyerName() {
		return buyerName;
	}
	
	/**
	* setBuyerName �����ļ���.
	* <p>ʹ��set��������˽�б���buyerName��ֵ<br>
	* @param buyerName ��ʾ�����
	*/
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	/**
	* getAmount �����ļ���.
	* <p>ʹ��get������ȡ˽�б���amount��ֵ<br>
	* @return amount ����amount��ֵ
	*/
	public double getAmount() {
		return amount;
	}
	
	/**
	* setAmount �����ļ���.
	* <p>ʹ��set��������˽�б���amount��ֵ<br>
	* @param amount ��ʾ���׽��
	*/
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	* getTime �����ļ���.
	* <p>ʹ��get������ȡ˽�б���time��ֵ<br>
	* @return time ����time��ֵ
	*/
	public Date getTime() {
		return time;
	}
	
	/**
	* setTime �����ļ���.
	* <p>ʹ��set��������˽�б���time��ֵ<br>
	* @param time ��ʾ����ʱ��
	*/
	public void setTime(Date time) {
		this.time = time;
	}
	
}
