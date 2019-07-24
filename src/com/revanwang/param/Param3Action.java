/**
 * 
 */
package com.revanwang.param;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 24, 20198:18:25 PM
 */
public class Param3Action extends ActionSupport implements ModelDriven<User> {


	private static final long serialVersionUID = 1L;
	private User u = new User();
	
	public void param3() {
		System.out.println(u.getName());
	}

	@Override
	public User getModel() {
		return u;
	}

}
