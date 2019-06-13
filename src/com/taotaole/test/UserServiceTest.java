package com.taotaole.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.taotaole.db.DButil;
import com.taotaole.model.User;
import com.taotaole.service.UserService;

public class UserServiceTest {

	@Test
	public void testQuery() {
		UserService us = new UserService();
		try {
			User user = us.query("小明");
			assertNotNull(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAddUser() {
		UserService us = new UserService();
		User user = new User();
		user.setUsername("小明");
		user.setPassword("123456");
		String input = "1999-10-12";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d=null;
		try {
			d = df.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user.setBirthday(d);
		user.setSex("男");
		user.setTelephoneNumber("13145689451");
		try {
			us.addUser(user);
			Connection conn = DButil.getConnection();
			String sql = "select * from user where username = ? and password= ?";
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, user.getUsername());
			ptmt.setString(2, user.getPassword());
			ResultSet rs = ptmt.executeQuery();
			assertTrue(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdateUser() {
		UserService us = new UserService();
		User user = new User();
		user.setId(5);
		user.setUsername("小明");
		user.setPassword("123");
		String input = "1999-10-12";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d=null;
		try {
			d = df.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user.setBirthday(d);
		user.setSex("男");
		user.setTelephoneNumber("13145689451");
		try {
			us.updateUser(user);
			User user2 = us.query("小明");
			assertEquals("123", user2.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
