/**
 * 
 */
package com.revanwang.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 24, 20198:40:31 PM
 */
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String checkLogin() {
		Map<String, Object> paraMap = ActionContext.getContext().getParameters();
		String[] paras = (String[]) paraMap.get("name");
		//存储name 到 session 中
		ActionContext.getContext().getSession().put("name", paras[0]);
		System.out.println("登陆成功：" +  paras[0]);
		return "loginSuccess";
	}

}
