package com.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.CapNhatHoSoImpl;
import com.entity.BangTotNghiep;
import com.entity.NganhHoc;
import com.entity.TrinhDoHocVan;
import com.entity.TruongHoc;
import com.entity.UngVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CapNhatHoSoDAO implements CapNhatHoSoImpl {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public UngVien getThongTin(String email) {
		
		Session session = sessionFactory.getCurrentSession();
		UngVien ungVien = (UngVien)session.createQuery("from ungvien where email ='"+email+"'").getSingleResult();
	
		return ungVien;
	}

	@Transactional
	public void updateProfile(UngVien ungVien, String email) {
		Session session = sessionFactory.getCurrentSession();
		UngVien ungVienOld = (UngVien)session.createQuery("from ungvien where email ='"+email+"'").getSingleResult();
		ungVienOld.setTenUngVien(ungVien.getTenUngVien());
		ungVienOld.setDiaChi(ungVien.getDiaChi());
		ungVienOld.setDienThoai(ungVien.getDienThoai());
		ungVienOld.setEmail(ungVien.getEmail());
		ungVienOld.setHinhAnhCaNhan(ungVien.getHinhAnhCaNhan());
		session.update(ungVienOld);
		
	}

	@Transactional
	public void updateEducation(UngVien ungVien, String email) {

		Session session = sessionFactory.getCurrentSession();
		UngVien ungVienOld = (UngVien)session.createQuery("from ungvien where email ='"+email+"'").getSingleResult();
		BangTotNghiep bangTotNghiep = session.get(BangTotNghiep.class,ungVienOld.getMaUngVien());
		bangTotNghiep.setTrinhDoHocVan(session.get(TrinhDoHocVan.class, ungVien.getBangTotNghiep().getTrinhDoHocVan().getMaTrinhDo()));
		bangTotNghiep.setTruongHoc(session.get(TruongHoc.class, ungVien.getBangTotNghiep().getTruongHoc().getMaTruong()));
		bangTotNghiep.setNganhHoc(session.get(NganhHoc.class, ungVien.getBangTotNghiep().getNganhHoc().getMaNganh()));
		bangTotNghiep.setNamNhapHoc(ungVien.getBangTotNghiep().getNamNhapHoc());
		bangTotNghiep.setNamTotNghiep(ungVien.getBangTotNghiep().getNamTotNghiep());
		session.update(bangTotNghiep);
	}
	
}
