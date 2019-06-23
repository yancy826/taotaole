package com.taotaole.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.taotaole.db.DButil;
import com.taotaole.model.Book;
import com.taotaole.service.BookService;

public class BookServiceTest {
	
	/**
	 * 方法名：testAddBook
	 * 测试添加书籍功能
	 */

	@Test
	public void testAddBook() {
		BookService bs = new BookService();
		Book book = new Book();
		book.setBookName("三国志");
		book.setAuthor("陈寿");
		Date d=new Date();    
		book.setPressTime(d);
		book.setCurrentCost(40.00);
		try {
			bs.addBook(book);
			Connection conn = DButil.getConnection();
			StringBuilder sb =new StringBuilder();
			sb.append("select * from book");
			sb.append(" where bookName like ?");
			PreparedStatement ptmt = conn.prepareStatement(sb.toString());
			ptmt.setString(1, book.getBookName());
			ResultSet rs = ptmt.executeQuery();
			assertTrue(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 方法名：testSerchBook
	 * 测试查询书籍功能
	 */

	@Test
	public void testSerchBook() {
		BookService bs=new BookService();
		String Content=new String("初等数论");
		try {
			List<Book> books=bs.serchBook(Content);
			assertNotNull(books);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	

	/**
	 *方法名：testSerchBookById
	 *测试根据书籍的编号来搜索书籍功能
	 */
	
	@Test
	public void testSerchBookById() {
		BookService bs = new BookService();
		try {
			Book book = bs.serchBookById(4);
			//System.out.println(book.getAuthor());
			assertNotNull(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 方法名：testQuery
	 * 测试查询数据功能
	 */

	@Test
	public void testQuery() {
		BookService bs = new BookService();
		try {
			List<Book> books = bs.query();
			assertNotNull(books);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	/**
	 * 方法名：testDeleteBook
	 * 测试删除书籍功能
	 */
	@Test
	public void testDeleteBook() {
		BookService bs = new BookService();
		try {
			bs.deleteBook(42);
			Connection conn = DButil.getConnection();
			StringBuilder sb =new StringBuilder();
			sb.append("select * from book");
			sb.append(" where id = ?");
			PreparedStatement ptmt = conn.prepareStatement(sb.toString());
			ptmt.setInt(1, 42);
			ResultSet rs = ptmt.executeQuery();
			assertFalse(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
