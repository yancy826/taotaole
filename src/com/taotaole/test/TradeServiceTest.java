package com.taotaole.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.taotaole.db.DButil;
import com.taotaole.model.Trade;
import com.taotaole.service.TradeService;

public class TradeServiceTest {
	
	/**
	 * ��������testAddTrade
	 * ������ӽ��׹���
	 */

	@Test
	public void testAddTrade() {
		TradeService ts = new TradeService();
		Trade trade = new Trade();
		trade.setBookName("��������ԭ��");
		trade.setBuyerName("����");
		trade.setSellerName("�Ż�");
		trade.setAmount(50);
		Date d = new Date();
		trade.setTime(d);
		try {
			ts.addTrade(trade);
			Connection conn = DButil.getConnection();
			StringBuilder sb =new StringBuilder();
			sb.append("select * from trade");
			sb.append(" where bookName = ? and buyername = ?");
			PreparedStatement ptmt = conn.prepareStatement(sb.toString());
			ptmt.setString(1,trade.getBookName());
			ptmt.setString(2,trade.getBuyerName());
			ResultSet rs = ptmt.executeQuery();
			assertTrue(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	/**
	 * ��������testSerchTrade
	 * ���Բ�ѯ���׹���
	 */
	@Test
	public void testSerchTrade() {
		TradeService ts = new TradeService();
		try {
			List<Trade> trades = ts.serchTrade("����");
			assertNotNull(trades);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��������testDeleteTrade
	 * ����ɾ�����׹���
	 */
	@Test
	public void testDeleteTrade() {
		TradeService ts = new TradeService();
		try {
			ts.deleteTrade(17);
			Connection conn = DButil.getConnection();
			StringBuilder sb =new StringBuilder();
			sb.append("select * from trade");
			sb.append(" where id = ?");
			PreparedStatement ptmt = conn.prepareStatement(sb.toString());
			ptmt.setInt(1,17);
			ResultSet rs = ptmt.executeQuery();
			assertFalse(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
