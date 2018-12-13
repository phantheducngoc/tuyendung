package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.TinTuyenDung;
import com.service.TinTuyenDungService;

@org.springframework.stereotype.Controller
@RequestMapping("/chitiet")
public class ChiTietController {

	@Autowired
	TinTuyenDungService tinTuyenDungService;
	
	
	@GetMapping("/{maTinTuyenDung}")
	public String Default(ModelMap modelMap, @PathVariable int maTinTuyenDung, HttpSession httpSession) {
		
		String user = "";
		
		if(httpSession.getAttribute("email")!= null) {
			user = httpSession.getAttribute("email").toString();
			user = user.substring(0, user.indexOf("@"));
		}
		
		modelMap.addAttribute("sessionUser", user);
		
		TinTuyenDung tinTuyenDung = tinTuyenDungService.getChiTietTinTuyenDung(maTinTuyenDung);
		modelMap.addAttribute("tinTuyenDung", tinTuyenDung);
		modelMap.addAttribute("maTinTuyenDung", maTinTuyenDung);
		return "chiTietTuyenDung";
	}
}
