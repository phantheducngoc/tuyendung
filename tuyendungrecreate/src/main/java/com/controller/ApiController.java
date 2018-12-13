package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.TinTuyenDung;
import com.service.TinTuyenDungService;


@Controller
@RequestMapping("apiController")
public class ApiController {

	@Autowired
	TinTuyenDungService tinTuyenDungService;
	
	@PostMapping
	@ResponseBody
	public void Default(@RequestParam("maTinTuyenDung") int maTinTuyenDung, HttpSession httpSession) {
		
				TinTuyenDung tinTuyenDung = tinTuyenDungService.getChiTietTinTuyenDung(maTinTuyenDung);
		tinTuyenDungService.nopHoSo(httpSession.getAttribute("email").toString(), maTinTuyenDung, tinTuyenDung);
	}
	
	@PostMapping("/quantam")
	@ResponseBody
	public void quantam(@RequestParam("maTinTuyenDung") int maTinTuyenDung, HttpSession httpSession) {
		
		System.out.println(maTinTuyenDung);
				TinTuyenDung tinTuyenDung = tinTuyenDungService.getChiTietTinTuyenDung(maTinTuyenDung);
		tinTuyenDungService.quanTam(httpSession.getAttribute("email").toString(), maTinTuyenDung, tinTuyenDung);
	}
}
