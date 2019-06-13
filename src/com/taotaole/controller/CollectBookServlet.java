package com.taotaole.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.taotaole.model.Book;
import com.taotaole.model.Collect;
import com.taotaole.model.User;
import com.taotaole.service.CollectService;

/**
 * Servlet implementation class CollectBookServlet
 */
@WebServlet("/CollectBookServlet")
public class CollectBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /** 
     * @see HttpServlet#HttpServlet()
     */
    public CollectBookServlet() {
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
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		Book book = (Book)session.getAttribute("book");
		if(user.getUsername().equals(book.getOwnerName())) {
			response.sendRedirect("a/failOfCollect.jsp");
			return;
		}
		Collect collect = new Collect();
		collect.setBuyerName(user.getUsername());
		collect.setSellerName(book.getOwnerName());
		collect.setPhase(book.getPhase());
		collect.setAmount(book.getCurrentCost());
		collect.setBookName(book.getBookName());
		CollectService cs = new CollectService();
		try {
			cs.addCollect(collect);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("a/successOfCollect.jsp");
	}

}
