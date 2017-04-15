package edu.stevens.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import edu.stevens.entity.User;


public class FrontloginFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{ 
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp"); 
		HttpServletRequest userRequest = (HttpServletRequest)request; 
		User user = (User)userRequest.getSession().getAttribute("user"); 
		//System.out.println(userRequest.getRequestURI());
		if(userRequest.getRequestURI().equals( "/LoginAction")){
			//System.out.println("请求登陆");
			chain.doFilter(request,response); 
			return;
		}
		if(user == null || user.getUserName() == null || user.getUserName().trim().length()<1) 
		{ 
			//System.out.println("用户未登录!"); 
			
			dispatcher.forward(request,response); 
			return; 
		} 
		chain.doFilter(request,response); 
	} 
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
