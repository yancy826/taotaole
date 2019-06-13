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

	@Test
	public void testAddCollect() {
		CollectService cs = new CollectService();
		Collect collect = new Collect();
		collect.setBuyerName("刘涵");
		collect.setBookName("概率论与数理统计");
		collect.setSellerName("张华");
		collect.setPhase("九品"); 
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

	@Test
	public void testSerchCollect() {
		CollectService cs = new CollectService();
		String content = new String("刘涵");
		try {
			List<Collect> collects = cs.serchCollect(content);
			assertNotNull(collects);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

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
