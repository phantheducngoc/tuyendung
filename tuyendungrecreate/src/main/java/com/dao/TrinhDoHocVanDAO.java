package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.TrinhDoHocVanImpl;
import com.entity.TrinhDoHocVan;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TrinhDoHocVanDAO implements TrinhDoHocVanImpl{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<TrinhDoHocVan> getTrinhDo() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<TrinhDoHocVan> listTrinhDoHocVan = (List<TrinhDoHocVan>)session.createQuery("from trinhdohocvan").getResultList();
		return listTrinhDoHocVan;
	}

}
