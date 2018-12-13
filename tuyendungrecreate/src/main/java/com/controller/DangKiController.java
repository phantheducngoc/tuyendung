package com.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.UngVien;
import com.service.DangKiUngVienService;

@Controller
@RequestMapping("dangki/")
public class DangKiController {
	
	@Autowired
	DangKiUngVienService dangKiUngVienService;

	@GetMapping
	public ModelAndView Default() {
		return new ModelAndView("dangki", "ungVien", new UngVien());
	}
	
	@PostMapping
	public String XuLyDangKi(@Valid @ModelAttribute("ungVien") UngVien ungVien,
			BindingResult result, ModelMap model,@RequestParam(name= "confirm") String confirm, HttpSession httpSession) {
			if(!(ungVien.getPassword()).equals(confirm)||result.hasErrors()) {
				return "dangki";
			}
			
			httpSession.setAttribute("email", ungVien.getEmail());
			dangKiUngVienService.insertUngVien(ungVien);
			
		return "redirect:/";
	} 
}
