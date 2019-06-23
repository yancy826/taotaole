package com.taotaole.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ���� LoginFilter����¼��
 * ������destroy��doFilter��init
 * ʵ�ֽ����˹�����Filter
 */
@WebFilter(filterName="LoginFilter",value="/a/*")
public class LoginFilter implements Filter {

	@Override
	/**
	 * ������destroy�����ٷ���
	 * ����ֵΪ��
	*/
	public void destroy() {

	}
 
	@Override
	/**
	 * <p>������ doFilter�����ٷ���<br>
	 * @return ����ֵΪ��<br>
	 * @param arg0 ����
	 * @param arg1Ӧ��
	 * @param arg2 ��������
	 * ServletRequest arg0, ServletResponse arg1, FilterChain arg2
	*/
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
		throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response =(HttpServletResponse)arg1;
		if(request.getSession().getAttribute("user")!=null) {
			arg2.doFilter(arg0, arg1);
		}else {
			response.sendRedirect("/ttl/login.jsp");
		}
	}

	@Override
	/**
	 * ������ init����ʼ������
	 * ����ֵΪ��
	 * һ���������ǹ���������FilterConfig
	*/
	public void init(FilterConfig arg0) throws ServletException {

	}

}
