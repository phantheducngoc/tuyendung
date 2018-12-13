package com.controller;

import javax.servlet.http.HttpSession;

public class GetSession {

	public static final String getSession(HttpSession httpSession) {
		
		String user = "";
		
		if(httpSession.getAttribute("email")!= null) {
			
			user = httpSession.getAttribute("email").toString();
			user = user.substring(0, user.indexOf("@"));
			
		}
		
		return user;
	}
}
