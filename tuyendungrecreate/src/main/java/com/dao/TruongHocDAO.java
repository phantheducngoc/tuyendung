package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.TruongHocImpl;
import com.entity.TruongHoc;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TruongHocDAO implements TruongHocImpl{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<TruongHoc> getTruongHoc() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<TruongHoc> listTruongHoc = (List<TruongHoc>)session.createQuery("from truonghoc").getResultList();
		return listTruongHoc;
	}

}
