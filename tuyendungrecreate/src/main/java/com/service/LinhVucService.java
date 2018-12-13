package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LinhVucDAO;
import com.daoimpl.LinhVucImpl;
import com.entity.LinhVuc;

@Service
public class LinhVucService implements LinhVucImpl {

	@Autowired
	LinhVucDAO linhVucDAO;
	

	public List<LinhVuc> getLinhVuc() {
		return linhVucDAO.getLinhVuc();
	}

}
