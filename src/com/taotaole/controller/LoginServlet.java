package com.taotaole.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taotaole.model.User;
import com.taotaole.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		request.getSession().removeAttribute("warning");
		StringBuilder sb = new StringBuilder();
		if(request.getParameter("username").length()==0) {
			sb.append("用户名不能为空");
			request.getSession().setAttribute("warning", sb.toString());
			response.sendRedirect("login.jsp");
		}else if(request.getParameter("password").length()==0) {
			sb.append("密码不能为空");
			request.getSession().setAttribute("warning", sb.toString());
			response.sendRedirect("login.jsp");
		}else {
			UserService us = new UserService();
			User user = new User();
			try {
				user = us.query(request.getParameter("username"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(user.getUsername().length()==0) {
				sb.append("用户名不存在，请重新登录");
			}else if(!user.getPassword().equals(request.getParameter("password"))){
				sb.append("密码错误，请重新登录");
			}
			if(sb.length()==0) {
				request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}else {
				request.setAttribute("warning", sb.toString());
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	}

}
