/**
 * 
 */
package com.revanwang.servletapi;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 24, 201912:00:19 PM
 */
public class ServletAPIAction3 extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String servletAPI3() {
		ActionContext ctx = ActionContext.getContext();
		Map<String, Object> paraMap = ctx.getParameters();
		String[] names = (String[]) paraMap.get("name");
		System.out.println(names[1]);
		
		
		ctx.put("name", paraMap.get("name"));
		
		return "api_3";
	}

}
