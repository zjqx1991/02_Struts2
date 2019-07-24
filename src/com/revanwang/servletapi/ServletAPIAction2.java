/**
 * 
 */
package com.revanwang.servletapi;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 24, 201911:43:39 AM
 */
public class ServletAPIAction2 extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String servletAPI2() {
		
		System.out.println("servletAPI2: " + ServletActionContext.getRequest().getParameter("id"));
		System.out.println("servletAPI2: " + ServletActionContext.getRequest().getParameter("name"));
		System.out.println("servletAPI2: " + ServletActionContext.getRequest().getParameter("age"));
		
		ServletActionContext.getRequest().setAttribute("name", ServletActionContext.getRequest().getParameter("name"));
		
		return "api_2";
	}

}
