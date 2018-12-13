package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class LogOutController {
	
	@GetMapping("/logOut")
	public String Default(HttpSession httpSession) {
		httpSession.invalidate();
		return "redirect:/";
	}
}
