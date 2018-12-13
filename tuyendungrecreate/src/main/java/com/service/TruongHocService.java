package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TruongHocDAO;
import com.daoimpl.TruongHocImpl;
import com.entity.TruongHoc;

@Service
public class TruongHocService implements TruongHocImpl{

	@Autowired
	TruongHocDAO truongHocDAO;
	
	public List<TruongHoc> getTruongHoc() {
		
		return truongHocDAO.getTruongHoc();
	}

}
