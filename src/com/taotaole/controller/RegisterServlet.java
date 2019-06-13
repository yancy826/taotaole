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

import com.taotaole.model.User;
import com.taotaole.service.UserService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public RegisterServlet() {
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
		request.getSession().removeAttribute("warning2");
		UserService us = new UserService();
		User user = new User();
		try {
			user = us.query(request.getParameter("username"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if(user.getUsername().length()!=0) {
			request.getSession().setAttribute("warning2", "用户名已存在请重新注册");
			response.sendRedirect("register.jsp");
		}else {
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			try {
				user.setBirthday(sdf.parse(request.getParameter("birthday")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			user.setSex(request.getParameter("sex"));
			user.setTelephoneNumber(request.getParameter("telephoneNumber"));
			user.setPersonalitySignature(request.getParameter("personalitySignature"));
			try {
				us.addUser(user);
			} catch (Exception e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("successOfRegister.jsp").forward(request, response);
		}
	}

}
