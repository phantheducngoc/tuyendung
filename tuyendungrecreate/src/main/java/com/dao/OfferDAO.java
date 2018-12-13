package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.OfferImpl;
import com.entity.Offer;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class OfferDAO implements OfferImpl {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public List<Offer> getOffer(int maUngVien) {
		
		System.out.println(maUngVien);
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Offer> listoffer = session.createQuery("from offer where maUngVien = "+maUngVien).getResultList();
		return listoffer;
	}

}
