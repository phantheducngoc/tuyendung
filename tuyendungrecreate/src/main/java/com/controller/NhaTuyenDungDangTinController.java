package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dangtintuyendung")
public class NhaTuyenDungDangTinController {
	
	@GetMapping
	public String Default(HttpSession httpSession, ModelMap modelMap) {
		
		modelMap.addAttribute("sessionUser", GetSession.getSession(httpSession));
		return "formDangTinTuyenDung";
	}
	
}
