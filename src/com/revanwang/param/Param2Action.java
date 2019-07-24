/**
 * 
 */
package com.revanwang.param;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 24, 20196:02:00 PM
 */
public class Param2Action extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private User user;
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public void Param2() {
		System.out.println(user.getName());
	}

}
