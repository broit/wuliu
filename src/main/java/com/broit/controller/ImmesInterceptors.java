package com.broit.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.broit.bean.LoginUserBean;

public class ImmesInterceptors implements HandlerInterceptor {

	Logger log = Logger.getLogger(this.getClass());

	public ImmesInterceptors() {
		super();
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		response.setHeader("contextPath", request.getContextPath());
		// 登录action不拦截
		String uri = request.getRequestURI().toString();
		if (uri.equalsIgnoreCase(request.getContextPath() + "/welcome.action")
				||uri.equalsIgnoreCase(request.getContextPath() + "/login.action")
				||uri.indexOf("/mobile/traceback/info.action")>-1) {
			return true;
		}
		LoginUserBean loginBean = (LoginUserBean) request.getSession().getAttribute(
				"loginUser");
		if (loginBean == null) {
			return toLogin(request,response);
		}else{
			return true;
		}
	}
	
	private boolean toLogin(HttpServletRequest request,
			HttpServletResponse response)throws Exception
	{
		if (request.getHeader("x-requested-with") != null
				&& request.getHeader("x-requested-with").equalsIgnoreCase(
						"XMLHttpRequest")) {
			response.setContentType("html/text;charset=utf-8");
			response.setHeader("sessionstatus", "timeout");// 在响应头设置session状态
            Map<String, Object> result = new HashMap<String, Object>();  
            result.put("success", false);  
            result.put("timeout",true);
            result.put("redirectUri","/welcome.action");
            PrintWriter out = response.getWriter();  
            out.print(JSONObject.fromObject(result).toString());  
            out.flush();  
            out.close();
            
			return false;
		}
		String root = request.getContextPath();
		String script = "<script language='javaScript'>"
				+ "if(window.opener!=null&&(typeof(window.opener)!='undefined')){window.close();window.location.replace('"
				+ root + "/welcome.action');}"
				+ "else window.top.location.replace('" + root
				+ "/welcome.action');" + "</script>";
		response.getOutputStream().println(script);
		response.getOutputStream().flush();
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
