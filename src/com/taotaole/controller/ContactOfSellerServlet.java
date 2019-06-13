package com.taotaole.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.taotaole.model.Book;
import com.taotaole.model.Trade;
import com.taotaole.model.User;
import com.taotaole.service.BookService;
import com.taotaole.service.TradeService;
import com.taotaole.service.UserService;

/**
 * Servlet implementation class ContactOfSellerServlet
 */
@WebServlet("/ContactOfSellerServlet")
public class ContactOfSellerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactOfSellerServlet() {
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
		TradeService ts = new TradeService();
		BookService bs = new BookService();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Book book = (Book) session.getAttribute("book");
		if(user.getUsername().equals(book.getOwnerName())) {
			response.sendRedirect("/ttl/a/error.jsp");
			return;
		}
		Trade trade = new Trade();
		trade.setBookName(book.getBookName());
		trade.setSellerName(book.getOwnerName());
		trade.setBuyerName(user.getUsername());
		trade.setAmount(book.getCurrentCost());
		try {
			ts.addTrade(trade);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			bs.deleteBook(book.getId());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		response.sendRedirect("/ttl/a/contactOfSeller.jsp");
	}

}
