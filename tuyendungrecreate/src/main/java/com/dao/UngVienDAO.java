package com.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.UngVienImpl;
import com.entity.UngVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UngVienDAO implements UngVienImpl{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public UngVien getUngVien(String email) {
		Session session = sessionFactory.getCurrentSession();
		UngVien ungVien = (UngVien)session.createQuery("from ungvien where email ='"+email+"'").getSingleResult();
		return ungVien;
	}

	
}
