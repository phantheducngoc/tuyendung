package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.NganhHocImpl;
import com.entity.NganhHoc;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NganhHocDAO implements NganhHocImpl{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<NganhHoc> getNganhHoc() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<NganhHoc> listNganhHoc = (List<NganhHoc>)session.createQuery("from nganhhoc").getResultList();
		return listNganhHoc;
	}

}
