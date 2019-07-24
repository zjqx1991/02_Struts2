/**
 * 
 */
package com.revanwang.servletapi;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Desc	Action类实现感知接口来访问 Servlet API
 * 			缺点：依赖servlet-api.jar
 * @author Revan Wang
 *
 * @Date Jul 24, 201911:23:15 AM
 */
public class ServletAPIAction1 extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private HttpServletRequest req;
	
	
	public void servletAPI() {
		System.out.println(this.req.getParameter("id"));
		System.out.println(this.req.getParameter("name"));
		System.out.println(this.req.getParameter("age"));
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.req = request;
	}

}
