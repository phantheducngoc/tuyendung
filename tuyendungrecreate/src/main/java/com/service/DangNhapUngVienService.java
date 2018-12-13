package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.NhaTuyenDungDAO;
import com.daoimpl.NhaTuyenDungImpl;

@Service
public class DangNhapUngVienService implements NhaTuyenDungImpl{
	
	@Autowired
	NhaTuyenDungDAO nhaTuyenDungDAO;

	public boolean checkAuthority(String email, String password) {
		return nhaTuyenDungDAO.checkAuthority(email, password);
	}

}
