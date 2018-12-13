package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.entity.NganhHoc;
import com.entity.TrinhDoHocVan;
import com.entity.TruongHoc;
import com.entity.UngVien;
import com.service.CapNhatHoSoService;
import com.service.NganhHocService;
import com.service.TrinhDoHocVanService;
import com.service.TruongHocService;

@Controller
public class CapNhatUngVienController {
	
	@Autowired
	CapNhatHoSoService capNhatHoSoService;
	
	@GetMapping("capNhatThongTin/")
	public String Default(HttpSession httpSession, ModelMap modelMap) {
		
		String user = CapNhatUngVienController.setSession(httpSession);
		modelMap.addAttribute("sessionUser", user);
		UngVien ungVien = capNhatHoSoService.getThongTin(httpSession.getAttribute("email").toString());
		modelMap.addAttribute("ungVien", ungVien);
		return "thongTinHoSo";
	}
	
	
	@GetMapping("capNhatThongTin/updateProfile/")
	public String showProfile(HttpSession httpSession,ModelMap modelMap) {
		
		String user = CapNhatUngVienController.setSession(httpSession);
		System.out.println(httpSession.getAttribute("email").toString());
		UngVien ungVien = capNhatHoSoService.getThongTin(httpSession.getAttribute("email").toString());
		modelMap.addAttribute("ungVien", ungVien);
		modelMap.addAttribute("sessionUser", user);
		return "profile";
	}
	
	@Autowired
	TrinhDoHocVanService trinhDoHocVanService;
	
	@Autowired
	TruongHocService truongHocService;
	
	@Autowired
	NganhHocService nganhHocService;
	
	@GetMapping("capNhatThongTin/updateEducation/")
	public String showEducation(HttpSession httpSession,ModelMap modelMap) {
		
		String user = CapNhatUngVienController.setSession(httpSession);
		System.out.println(httpSession.getAttribute("email").toString());
		UngVien ungVien = capNhatHoSoService.getThongTin(httpSession.getAttribute("email").toString());
		modelMap.addAttribute("ungVien", ungVien);
		modelMap.addAttribute("sessionUser", user);
		
		Map<String,String> listTrinhDo = trinhDoHocVanService.getTrinhDo();
		modelMap.addAttribute("listTrinhDo", listTrinhDo);
		
		List<TruongHoc> listTruongHoc = truongHocService.getTruongHoc();
		Map<String, String> mapTruongHoc = new LinkedHashMap<String, String>();
		for(TruongHoc truongHoc : listTruongHoc) {
			mapTruongHoc.put(""+truongHoc.getMaTruong(), truongHoc.getTenTruong());
		}
		modelMap.addAttribute("mapTruongHoc",mapTruongHoc);
		
		List<NganhHoc> listNganhHoc = nganhHocService.getNganhHoc();
		Map<String, String> mapNganhHoc = new LinkedHashMap<String, String>();
		for(NganhHoc nganhHoc : listNganhHoc) {
			mapNganhHoc.put(""+nganhHoc.getMaNganh(), nganhHoc.getTenNganh());
		}
		modelMap.addAttribute("mapNganhHoc",mapNganhHoc);
		
		return "education";
	}
	
	@PostMapping("capNhatThongTin/updateEducation/")
	public String updateEducation( @ModelAttribute("ungVien")UngVien ungVien, HttpSession httpSession,ModelMap modelMap) {
		
		capNhatHoSoService.updateEducation(ungVien,httpSession.getAttribute("email").toString());
		
		return "redirect:/capNhatThongTin/";
	}
	

	@Autowired
	ServletContext context;
	
	@PostMapping("capNhatThongTin/updateProfile/")
	public String UploadFile(MultipartHttpServletRequest hinhAnh, @ModelAttribute("ungVien")UngVien ungVien, HttpSession httpSession,ModelMap modelMap) {
		
		String pathSaveFile = context.getRealPath("resources/images/");
		Iterator<String> listName = hinhAnh.getFileNames();
		MultipartFile mtf = hinhAnh.getFile(listName.next());
		
		if(!ObjectUtils.isEmpty(mtf)) {
			File fileSave = new File(pathSaveFile + mtf.getOriginalFilename());
			
			System.out.println("sssssssssssssssssssssssssss"+mtf.getOriginalFilename());
			
			ungVien.setHinhAnhCaNhan(mtf.getOriginalFilename());
			
			try {
				mtf.transferTo(fileSave);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		capNhatHoSoService.updateProfile(ungVien,httpSession.getAttribute("email").toString());
		
		return "redirect:/capNhatThongTin/";
	}
	
	
	private static String setSession(HttpSession httpSession) {
		String user = "";
		if(!ObjectUtils.isEmpty(httpSession.getAttribute("email"))) {
			user = httpSession.getAttribute("email").toString();
			user = user.substring(0, user.indexOf("@"));
		}
		return user;
	}
	
}
