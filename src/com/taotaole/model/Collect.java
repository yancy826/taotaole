package com.taotaole.model;

import java.io.Serializable;
/**
 * @author �ճ�һ
* <p>Collect ��ļ���.<br>
* �ղؼ�¼��ʵ����<br>
* �漰��˽�б�����id�����ҡ���ҡ�������Ʒ�ࡢ���<br>
* ʹ��get��set������˽�б������з��ʺ�����
*/
public class Collect implements Serializable{
	
	private int id;
	private String sellerName;//����
	private String buyerName;//���
	private String bookName;//����
	private String phase;//Ʒ��
	private double amount;//���
	
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
	* @param amount ��ʾ���
	*/
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
