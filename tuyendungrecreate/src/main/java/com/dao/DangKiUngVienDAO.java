package com.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.DangKiUngVienImpl;
import com.entity.BangTotNghiep;
import com.entity.HoSoUngVien;
import com.entity.TaiKhoan;
import com.entity.UngVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DangKiUngVienDAO implements DangKiUngVienImpl {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void insertUngVien(UngVien ungVien) {

		Session session = sessionFactory.getCurrentSession();
		TaiKhoan taiKhoan = session.get(TaiKhoan.class, 1);
		ungVien.setTaiKhoan(taiKhoan);
		
		BangTotNghiep bangTotNghiep = new BangTotNghiep();
		HoSoUngVien hoSoUngVien = new HoSoUngVien();
		
		ungVien.setBangTotNghiep(bangTotNghiep);
		bangTotNghiep.setUngVien(ungVien);
		
		ungVien.setHoSoUngVien(hoSoUngVien);
		hoSoUngVien.setUngVien(ungVien);
		
		session.save(ungVien);
	}
}
