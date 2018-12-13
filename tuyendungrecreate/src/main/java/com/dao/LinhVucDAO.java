package com.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.LinhVucImpl;
import com.entity.LinhVuc;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LinhVucDAO implements LinhVucImpl{

	@Autowired
	SessionFactory sessionFactory;
	
	
	
	@Transactional
	public List<LinhVuc> getLinhVuc() {

		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<LinhVuc> results = session.createQuery("from linhvuc").getResultList();
		for(LinhVuc linhvuc : results) {
		
			System.out.println(linhvuc.getTenLinhVuc());
		}
		
		return results;
	}
}
