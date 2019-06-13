package com.taotaole.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taotaole.model.Collect;
import com.taotaole.model.Trade;
import com.taotaole.model.User;
import com.taotaole.service.CollectService;

/**
 * Servlet implementation class SerchCollectServlet
 */
@WebServlet("/SerchCollectServlet")
public class SerchCollectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerchCollectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User)request.getSession().getAttribute("user");
		CollectService ts = new CollectService();
		List<Collect> collects = new ArrayList<Collect>();
		try {
			collects = ts.serchCollect(user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getSession().setAttribute("collects", collects);
		response.sendRedirect("a/collectList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
