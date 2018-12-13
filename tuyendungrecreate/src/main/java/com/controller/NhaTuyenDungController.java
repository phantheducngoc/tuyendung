package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.NhaTuyenDungService;

@Controller
@RequestMapping("dangnhapNTD")
public class NhaTuyenDungController {
	
	@Autowired
	NhaTuyenDungService nhaTuyenDungService;

	@GetMapping
	public String Default() {
		return "dangnhapNTD";
	}
	
	@PostMapping
	public String XulyDangNhap(@RequestParam String email, @RequestParam String password, ModelMap modelMap, HttpSession httpSession) {
	
	boolean checkAuthority = false;
	
	String error = "";
	
	checkAuthority = nhaTuyenDungService.checkAuthority(email, password);
	if(checkAuthority == true) {
		httpSession.setAttribute("email", email);
		return "redirect:/nhatuyendung";
	}
	error = "Đăng nhập thất bại";
	modelMap.addAttribute("error", error);
	return "dangnhapNTD";
	
}
}
