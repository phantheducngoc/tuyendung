package com.dao;
import java.util.ArrayList;
import java.util.List;

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

import com.daoimpl.TinTuyenDungImpl;
import com.entity.NopHoSo;
import com.entity.QuanTam;
import com.entity.SearchForm;
import com.entity.TinTuyenDung;
import com.entity.UngVien;
import com.mysql.cj.core.util.StringUtils;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TinTuyenDungDAO implements TinTuyenDungImpl{

	@Autowired
	SessionFactory sessionFactory;
	
	
	
	@Transactional
	public List<TinTuyenDung> getListTinTuyenDung(SearchForm searchForm) {

		String keyword = "";
		
		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("deprecation")
		Criteria cr = session.createCriteria(TinTuyenDung.class,"tintuyendung");
		Criterion orExp1 = null;
		Criterion moTa = null;
		Criterion chucDanh = null;
		Criterion mucLuongToiThieu = null;
		Criterion mucLuongToiDa = null;
		Criterion nganhNghe = null;
		Criterion nganhNgheList = null;
		cr.createAlias("nganhNghe", "nganhNghe");

		if(!StringUtils.isEmptyOrWhitespaceOnly(searchForm.getFreeKeyword())) {
			
			keyword = "%" + searchForm.getFreeKeyword() + "%";
			moTa = Restrictions.ilike("moTa", keyword);
			chucDanh = Restrictions.ilike("chucDanh", keyword);
			mucLuongToiThieu = Restrictions.ilike("mucLuongToiThieu", keyword);
			mucLuongToiDa = Restrictions.ilike("mucLuongToiDa", keyword);
			
			nganhNghe = Restrictions.ilike("nganhNghe.tenNganhNghe", keyword);
			
			orExp1 = Restrictions.or(moTa, chucDanh, mucLuongToiThieu, mucLuongToiDa,nganhNghe);
			cr.add( orExp1 );
		}
		
		if(!ObjectUtils.isEmpty(searchForm.getMaNganhNghe())) {
			nganhNgheList = Restrictions.in("nganhNghe.maNganhNghe",searchForm.getMaNganhNghe());
			cr.add( nganhNgheList );
		}

		@SuppressWarnings("unchecked")
		List<TinTuyenDung> results = cr.list();
		
		return results;
	}

	@Transactional
	public TinTuyenDung getChiTietTinTuyenDung(int maTinTuyenDung) {
		Session session = sessionFactory.getCurrentSession();
		TinTuyenDung tinTuyenDung = (TinTuyenDung) session.createQuery("from tintuyendung ttd where ttd.maTinTuyenDung = " + maTinTuyenDung).getSingleResult();
		return tinTuyenDung;
	}

	public void indexTinTuyenDung() {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void nopHoSo(String email, int maTinTuyenDung, TinTuyenDung tinTuyenDung) {

		Session session = sessionFactory.getCurrentSession();
		UngVien ungVien = (UngVien) session.createQuery("from ungvien where email='"+email+"'").getSingleResult();
		NopHoSo nopHoSo = new NopHoSo();
		NopHoSoId id = new NopHoSoId();
		id.setUngVien(ungVien);
		id.setNhaTuyenDung(tinTuyenDung.getNhaTuyenDung());
		id.setTinTuyenDung(tinTuyenDung);
		nopHoSo.setId(id);
		session.save(nopHoSo);
		
		
	}
	
	@Transactional
	public void quanTam(String email, int maTinTuyenDung, TinTuyenDung tinTuyenDung) {

		Session session = sessionFactory.getCurrentSession();
		UngVien ungVien = (UngVien) session.createQuery("from ungvien where email='"+email+"'").getSingleResult();
		QuanTam quanTam = new QuanTam();
		NopHoSoId id = new NopHoSoId();
		id.setUngVien(ungVien);
		id.setNhaTuyenDung(tinTuyenDung.getNhaTuyenDung());
		id.setTinTuyenDung(tinTuyenDung);
		quanTam.setId(id);
		session.save(quanTam);
		
		
	}
	
	@Transactional
	public List<TinTuyenDung> getTinUngTuyen(String email){
		
		Session session = sessionFactory.getCurrentSession();
		UngVien ungVien = (UngVien) session.createQuery("from ungvien where email='"+email+"'").getSingleResult();
		List<NopHoSo> nopHoSo =  session.createQuery("from nophoso where maUngVien = "+ungVien.getMaUngVien()).getResultList();
		
		List<TinTuyenDung> listTinTuyenDung = new ArrayList<TinTuyenDung>();
		TinTuyenDung tinTuyenDung;
		for(NopHoSo hoso : nopHoSo ) {
			tinTuyenDung = hoso.getId().getTinTuyenDung();
			listTinTuyenDung.add(tinTuyenDung);
		}
		return listTinTuyenDung;
		
		
	}
	
	@Transactional
	public List<TinTuyenDung> getTinQuanTam(String email){
		
		Session session = sessionFactory.getCurrentSession();
		UngVien ungVien = (UngVien) session.createQuery("from ungvien where email='"+email+"'").getSingleResult();
		List<QuanTam> listviecquantam =  session.createQuery("from viecquantam where maUngVien = "+ungVien.getMaUngVien()).getResultList();
		
		List<TinTuyenDung> listTinTuyenDung = new ArrayList<TinTuyenDung>();
		TinTuyenDung tinTuyenDung;
		for(QuanTam ViecQuanTam : listviecquantam ) {
			tinTuyenDung = ViecQuanTam.getId().getTinTuyenDung();
			listTinTuyenDung.add(tinTuyenDung);
		}
		return listTinTuyenDung;
		
		
	}
}
