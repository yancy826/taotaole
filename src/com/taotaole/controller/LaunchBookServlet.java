package com.taotaole.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taotaole.model.Book;
import com.taotaole.model.User;
import com.taotaole.service.BookService;

/**
 * Servlet implementation class LaunchBookServlet
 */
@WebServlet("/LaunchBookServlet")
public class LaunchBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LaunchBookServlet() {
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
		BookService bs = new BookService();
		
		Book book = new Book();
		book.setBookName(request.getParameter("bookName"));
		book.setAuthor(request.getParameter("author"));
		book.setBinding(request.getParameter("binding"));
		book.setOriginalCost(Double.valueOf(request.getParameter("originalCost")));
		book.setCurrentCost(Double.valueOf(request.getParameter("currentCost")));
		book.setPress(request.getParameter("press"));
		User user = (User) request.getSession().getAttribute("user");
		book.setOwnerName(user.getUsername());
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			d = sdf.parse(request.getParameter("pressTime"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		book.setPressTime(d);
		book.setPhase(request.getParameter("Phase"));
		book.setBookSize(request.getParameter("bookSize"));
		book.setPageNum(Integer.valueOf(request.getParameter("pageNum")));
		book.setGrade(request.getParameter("grade"));
		book.setProfession(request.getParameter("profession"));
		
		try {
			bs.addBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("index.jsp");
	}

}
