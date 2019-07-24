/**
 * 
 */
package com.revanwang.param;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 24, 20195:44:34 PM
 */
public class Param1Action extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	//直接定义参数名称
	private String name;
	private String password;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void param1() {
		System.out.println(this.name);
		System.out.println(this.password);
	}
}
