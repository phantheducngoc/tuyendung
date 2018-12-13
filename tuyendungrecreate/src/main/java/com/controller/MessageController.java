package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Messages;
import com.entity.UngVien;
import com.service.MessageService;
import com.service.UngVienService;

@Controller
@RequestMapping("quanlymessage")
public class MessageController {
	
	@Autowired
	MessageService messageService;

	@Autowired
	UngVienService ungVienService;
	@GetMapping()
	public String getQuanLyTinNhanDen(ModelMap modelMap, HttpSession httpSession) {
		
		String user = "";
		if(httpSession.getAttribute("email")!= null) {
			user = httpSession.getAttribute("email").toString();
			user = user.substring(0, user.indexOf("@"));
		}
		
		UngVien ungVien = ungVienService.getUngVien(httpSession.getAttribute("email").toString());
		
		List<Messages> listMessages = messageService.getReceivedMessages(ungVien);
		
		modelMap.addAttribute("sessionUser", user);
		
		modelMap.addAttribute("listMessages", listMessages);
		return "message";
	}
	
	@GetMapping("/sendMessage/{id}")
	public String getContentMessage(@PathVariable int id, HttpSession httpSession, ModelMap modelMap) {
		System.out.println(id);
		Messages message = messageService.getMessage(id);
		System.out.println(message.getContent());
		modelMap.addAttribute("message", message);
		return "sendMessage";
	}
	
}
