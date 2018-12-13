package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.NganhHocDAO;
import com.daoimpl.NganhHocImpl;
import com.entity.NganhHoc;

@Service
public class NganhHocService implements NganhHocImpl{

	@Autowired
	NganhHocDAO nganhHocDAO;
	
	public List<NganhHoc> getNganhHoc() {
		
		return nganhHocDAO.getNganhHoc();
	}

}
