package com.taotaole.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taotaole.model.Book;
import com.taotaole.service.BookService;

/**
 * Servlet implementation class SerchServlet
 */
@WebServlet("/SerchServlet")
public class SerchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /** 
     * @see HttpServlet#HttpServlet()
     */
    public SerchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		System.out.println(request.getParameter("serchContent"));
		BookService bs = new BookService();
		List<Book> books = null;
		if(request.getParameter("serchContent").length()!=0) {
			try {
				books = bs.serchBook(request.getParameter("serchContent"));
			} catch (Exception e) {
				e.printStackTrace();
			}  
		}else {
			try {
				books = bs.query(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		request.getSession().setAttribute("books", books);
//		if(books.size()!=0){
//			for (Book book : books) {
//				System.out.println(book.getId()+",ÊéÃû£º"+book.getBookName());
//			}
//		}else {
//			System.out.println("booksÎª¿Õ");
//		}
		if(books.size()==0) {
			response.sendRedirect("/ttl/a/failToSerch.jsp");
		}else {
			response.sendRedirect("/ttl/a/bookList.jsp");
		} 
	}
}
