package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
public class helloAction extends ActionSupport {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public String execute() throws Exception {
		
			System.out.println("struts==========================");
	           return "success";

		}
}
