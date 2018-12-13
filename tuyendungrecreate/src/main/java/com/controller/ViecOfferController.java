package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Offer;
import com.entity.UngVien;
import com.service.OfferService;
import com.service.UngVienService;

@Controller
@RequestMapping("viecoffer")
public class ViecOfferController {
	
	@Autowired
	OfferService offerService;
	
	@Autowired
	UngVienService ungVienService;

	@GetMapping
	public String showTinQuanTam(HttpSession httpSession, ModelMap modelMap){
		
		String user = "";
		if(httpSession.getAttribute("email")!= null) {
			user = httpSession.getAttribute("email").toString();
			user = user.substring(0, user.indexOf("@"));
		}	
		modelMap.addAttribute("sessionUser", user);
		
		UngVien ungVien = ungVienService.getUngVien(httpSession.getAttribute("email").toString());
		
		List<Offer> listOffer = offerService.getOffer(ungVien.getMaUngVien());
		modelMap.addAttribute("listOffer", listOffer);
		return "viecoffer";
	}
}
