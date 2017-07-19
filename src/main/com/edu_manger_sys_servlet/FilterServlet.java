package com.edu_manger_sys_servlet;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterServlet extends HttpServlet implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		((HttpServletRequest) request).setCharacterEncoding("utf-8");  //这个地方设置编码过滤方式
		((HttpServletResponse) response).setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig filterConfig) throws ServletException {
			
	}

}
