package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.service.DangNhapUngVienService;

@Controller
@RequestMapping("dangnhap/")
@SessionAttributes("email")
public class DangNhapController {
	
	@Autowired
	DangNhapUngVienService dangNhapUngVienService;
	
	String error = "";
	
	@GetMapping
		public String Default(){
		return "dangnhap";
	}
	
	@PostMapping
		public String XulyDangNhap(@RequestParam String email, @RequestParam String password, ModelMap modelMap, HttpSession httpSession) {
		
		boolean checkAuthority = false;
		
		checkAuthority = dangNhapUngVienService.checkAuthority(email, password);
		if(checkAuthority == true) {
			httpSession.setAttribute("email", email);
			return "redirect:/";
		}
		this.error = "Đăng nhập thất bại";
		modelMap.addAttribute("error", this.error);
		return "dangnhap";
		
	}
	
	

}
