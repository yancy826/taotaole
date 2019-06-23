package com.taotaole.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.junit.Test;

import com.taotaole.db.DButil;
import com.taotaole.model.Collect;
import com.taotaole.service.CollectService;

public class CollectServiceTest {
	
	/**
	 * ��������testAddCollect
	 * ��������ղع���
	 */

	@Test
	public void testAddCollect() {
		CollectService cs = new CollectService();
		Collect collect = new Collect();
		collect.setBuyerName("����");
		collect.setBookName("������������ͳ��");
		collect.setSellerName("�Ż�");
		collect.setPhase("��Ʒ"); 
		collect.setAmount(30);
		try {
			cs.addCollect(collect);
			Connection conn = DButil.getConnection();
			StringBuilder sb =new StringBuilder();
			sb.append("select * from collect");
			sb.append(" where buyername = ? and BookName = ? and SellerName = ?");
			PreparedStatement ptmt = conn.prepareStatement(sb.toString());
			ptmt.setString(1,collect.getBuyerName());
			ptmt.setString(2,collect.getBookName());
			ptmt.setString(3, collect.getSellerName());
			ResultSet rs = ptmt.executeQuery();
			assertTrue(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


    /**
     * ��������testSerchCollect
     * ���Բ�ѯ�ղع���
     */
	@Test
	public void testSerchCollect() {
		CollectService cs = new CollectService();
		String content = new String("����");
		try {
			List<Collect> collects = cs.serchCollect(content);
			assertNotNull(collects);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * ��������testDeleteCollect
	 * ����ɾ���ղع���
	 */

	@Test
	public void testDeleteCollect() {
		CollectService cs = new CollectService();
		try {
			cs.deleteCollect(10);
			Connection conn = DButil.getConnection();
			StringBuilder sb =new StringBuilder();
			sb.append("select * from collect");
			sb.append(" where id = ?");
			PreparedStatement ptmt = conn.prepareStatement(sb.toString());
			ptmt.setInt(1,10);
			ResultSet rs = ptmt.executeQuery();
			assertNotNull(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
