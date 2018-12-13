package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.LinhVuc;
import com.entity.SearchForm;
import com.entity.TinTuyenDung;
import com.service.LinhVucService;
import com.service.TinTuyenDungService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	TinTuyenDungService tinTuyenDungService;
	
	@Autowired
	LinhVucService linhVucService;
	
	@RequestMapping("/")
	public String Default(@ModelAttribute("searchForm") SearchForm searchForm,ModelMap modelMap, HttpSession httpSession) {
		
		List<TinTuyenDung> listTinTuyenDung = tinTuyenDungService.getListTinTuyenDung(searchForm);
		
		String user = "";
		
		modelMap.addAttribute("listTinTuyenDung", listTinTuyenDung);
		if(httpSession.getAttribute("email")!= null) {
			user = httpSession.getAttribute("email").toString();
			user = user.substring(0, user.indexOf("@"));
		}
		
		modelMap.addAttribute("sessionUser", user);
		return "trangchu";
	}
	
	@RequestMapping("/searchJobs")
	public String searchJobs(@ModelAttribute("searchForm") SearchForm searchForm, ModelMap modelMap) {
		List<TinTuyenDung> listTinTuyenDung = tinTuyenDungService.getListTinTuyenDung(searchForm);
		modelMap.addAttribute("listTinTuyenDung", listTinTuyenDung);
		List<LinhVuc> listLinhVuc = linhVucService.getLinhVuc();
		modelMap.addAttribute("listLinhVuc", listLinhVuc);
		
		return "searchJobs";
	}
}
