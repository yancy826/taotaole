package com.taotaole.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static final String URL = "jdbc:mysql://localhost/taotaole";
	private static final String USER = "root";
	private static final String PASSWORD = "ycy13287643886";
	private static Connection conn = null;
	static{
        try {
            Class.forName("com.mysql.jdbc.Driver");// ¶¯Ì¬¼ÓÔØmysqlÇý¶¯
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public static Connection getConnection() {
		return conn;
	}
}
