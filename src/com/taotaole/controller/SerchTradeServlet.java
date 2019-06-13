package com.taotaole.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taotaole.model.Trade;
import com.taotaole.model.User;
import com.taotaole.service.TradeService;

/**
 * Servlet implementation class SerchTradeServlet
 */
@WebServlet("/SerchTradeServlet")
public class SerchTradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerchTradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User)request.getSession().getAttribute("user");
		TradeService ts = new TradeService();
		List<Trade> trades = new ArrayList<Trade>();
		try {
			trades = ts.serchTrade(user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getSession().setAttribute("trades", trades);
		response.sendRedirect("a/tradeList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
