package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.TinTuyenDung;
import com.service.TinTuyenDungService;

@Controller
@RequestMapping("/ungtuyen")
public class UngTuyenController {
	
	@Autowired
	TinTuyenDungService tinTuyenDungService;

	@GetMapping("/")
	public String showTinUngTuyen(HttpSession httpSession, ModelMap modelMap){
		
		String user = "";
		
		if(httpSession.getAttribute("email")!= null) {
			user = httpSession.getAttribute("email").toString();
			user = user.substring(0, user.indexOf("@"));
		}
		
		modelMap.addAttribute("sessionUser", user);
		List<TinTuyenDung> tinTuyenDung = tinTuyenDungService.getTinUngTuyen(httpSession.getAttribute("email").toString());
		modelMap.addAttribute("listTinTuyenDung", tinTuyenDung);
		return "tinungtuyen";
	}
}
