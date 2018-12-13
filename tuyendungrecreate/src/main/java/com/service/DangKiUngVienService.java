package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DangKiUngVienDAO;
import com.daoimpl.DangKiUngVienImpl;
import com.entity.UngVien;

@Service
public class DangKiUngVienService implements DangKiUngVienImpl{
	
	@Autowired
	DangKiUngVienDAO dangKiUngVienDAO;

	public void insertUngVien(UngVien ungVien) {
		dangKiUngVienDAO.insertUngVien(ungVien);
		
	}

	
}
