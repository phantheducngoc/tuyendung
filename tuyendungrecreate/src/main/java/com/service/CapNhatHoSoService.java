package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CapNhatHoSoDAO;
import com.daoimpl.CapNhatHoSoImpl;
import com.entity.UngVien;

@Service
public class CapNhatHoSoService implements CapNhatHoSoImpl{

	@Autowired
	private CapNhatHoSoDAO capNhatHoSo;
	
	public UngVien getThongTin(String email) {

		return capNhatHoSo.getThongTin(email);
	}

	public void updateProfile(UngVien ungVien, String email) {

		capNhatHoSo.updateProfile(ungVien, email);
	}

	public void updateEducation(UngVien ungVien, String email) {

		capNhatHoSo.updateEducation(ungVien, email);
	}

}
