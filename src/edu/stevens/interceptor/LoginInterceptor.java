package edu.stevens.interceptor;


import javax.interceptor.InvocationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		ActionContext act = ActionContext.getContext();
		System.out.println("判断是否登陆");
		if(act.getSession().get("user")==null){
			return "noLogin";
			
		}
		return arg0.invoke();
	}

}
