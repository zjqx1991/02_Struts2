/**
 * 
 */
package com.revanwang.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 24, 20198:46:19 PM
 */
public class HomeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String home() {
		System.out.println("欢迎：" + ActionContext.getContext().getSession().get("name")+ "回家");
		return "home";
	}

}
