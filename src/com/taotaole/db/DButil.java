package com.taotaole.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author 颜超一
* <p>DButil 类的简述.<br>
* 使用jdbc连接数据库<br>
*/
public class DButil {
	private static final String URL = "jdbc:mysql://localhost/taotaole";
	private static final String USER = "root";
	private static final String PASSWORD = "ycy13287643886";
	private static Connection conn = null;
	static{
        try {
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	/**
	* getConnection 方法的简述.
	* <p>使用get方法获取数据库的连接<br>
	* @return conn 返回conn
	*/
	public static Connection getConnection() {
		return conn;
	}
}
