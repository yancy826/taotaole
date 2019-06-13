package com.taotaole.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.taotaole.model.User;
import com.taotaole.service.UserService;

/**
 * Servlet implementation class UpdateUserInfoServlet
 */
@WebServlet("/UpdateUserInfoServlet")
public class UpdateUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		User user = new User();
		user.setId(Integer.valueOf(request.getParameter("id")));
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
		UserService us = new UserService();
		try {
			us.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		session.setAttribute("user", user);
		response.sendRedirect("a/userInfo.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
