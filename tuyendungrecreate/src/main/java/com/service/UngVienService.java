package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UngVienDAO;
import com.daoimpl.UngVienImpl;
import com.entity.UngVien;

@Service
public class UngVienService implements UngVienImpl {

	@Autowired
	UngVienDAO ungVienDAO;
	public UngVien getUngVien(String email) {
		return ungVienDAO.getUngVien(email);
	}

}
