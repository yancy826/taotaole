package com.taotaole.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author �ճ�һ
* <p>DButil ��ļ���.<br>
* ʹ��jdbc�������ݿ�<br>
*/
public class DButil {
	private static final String URL = "jdbc:mysql://localhost/taotaole";
	private static final String USER = "root";
	private static final String PASSWORD = "ycy13287643886";
	private static Connection conn = null;
	static{
        try {
            Class.forName("com.mysql.jdbc.Driver");// ��̬����mysql����
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	/**
	* getConnection �����ļ���.
	* <p>ʹ��get������ȡ���ݿ������<br>
	* @return conn ����conn
	*/
	public static Connection getConnection() {
		return conn;
	}
}
