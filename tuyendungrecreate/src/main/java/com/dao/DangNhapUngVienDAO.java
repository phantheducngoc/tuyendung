package com.dao;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import com.daoimpl.DangNhapUngVienImpl;
import com.entity.UngVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DangNhapUngVienDAO implements DangNhapUngVienImpl{
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("deprecation")
	@Transactional
	public boolean checkAuthority(String email, String password) {
		
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(UngVien.class, "UngVien");
		Criterion emailCheck = Restrictions.eq("email", email);
		Criterion passwordCheck = Restrictions.eq("password", password);
		Criterion exp = Restrictions.and(emailCheck, passwordCheck);
		cr.add(exp);
		cr.list();
		
		
		if(ObjectUtils.isEmpty(cr.list())) {
			return false;
		}
		
		return true;
	}

}
