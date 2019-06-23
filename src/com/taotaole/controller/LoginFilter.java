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
 * 类名 LoginFilter，登录类
 * 方法有destroy、doFilter和init
 * 实现借助了过滤器Filter
 */
@WebFilter(filterName="LoginFilter",value="/a/*")
public class LoginFilter implements Filter {

	@Override
	/**
	 * 方法名destroy，销毁方法
	 * 返回值为空
	*/
	public void destroy() {

	}
 
	@Override
	/**
	 * <p>方法名 doFilter，销毁方法<br>
	 * @return 返回值为空<br>
	 * @param arg0 请求
	 * @param arg1应答
	 * @param arg2 过滤器链
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
	 * 方法名 init，初始化方法
	 * 返回值为空
	 * 一个参数，是过滤器配置FilterConfig
	*/
	public void init(FilterConfig arg0) throws ServletException {

	}

}
