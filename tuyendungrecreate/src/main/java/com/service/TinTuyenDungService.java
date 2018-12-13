package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TinTuyenDungDAO;
import com.daoimpl.TinTuyenDungImpl;
import com.entity.SearchForm;
import com.entity.TinTuyenDung;

@Service
public class TinTuyenDungService implements TinTuyenDungImpl {

	@Autowired
	TinTuyenDungDAO tinTuyenDungDAO;
	
	public List<TinTuyenDung> getListTinTuyenDung(SearchForm searchForm) {
		final String OLD_FORMAT = "yyyy-MM-dd";
		final String NEW_FORMAT = "dd/MM/YYYY";
		String oldDateString = "";
		String newDateString = "";
		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		Date d = null;
		float minSalary = 0;
		float maxSalary = 0;
		
		List<TinTuyenDung> listTinTuyenDung = tinTuyenDungDAO.getListTinTuyenDung(searchForm);
		for(TinTuyenDung tinTuyenDung : listTinTuyenDung) {
			
			//format date yyyy-mm-dd to dd/mm/yyyy 
			oldDateString = tinTuyenDung.getNgayHetHan().trim();
			try {
				d = sdf.parse(oldDateString);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			sdf.applyPattern(NEW_FORMAT);
			newDateString = sdf.format(d);
			tinTuyenDung.setNgayHetHan(newDateString);
			newDateString = "";
			oldDateString = "";
			sdf.applyPattern(OLD_FORMAT);
			
			// remove unnecessary zero decimal
			minSalary = Float.parseFloat(tinTuyenDung.getMucLuongToiThieu());
			if(minSalary == (int)minSalary) {
				tinTuyenDung.setMucLuongToiThieu(Integer.toString((int)minSalary));
			}
			
			// remove unnecessary zero decimal
			maxSalary = Float.parseFloat(tinTuyenDung.getMucLuongToiDa());
			if(maxSalary == (int)maxSalary) {
				tinTuyenDung.setMucLuongToiDa(Integer.toString((int)maxSalary));
			}
		}
		return listTinTuyenDung;
	}

	public TinTuyenDung getChiTietTinTuyenDung(int maTinTuyenDung) {
		final String OLD_FORMAT = "yyyy-MM-dd";
		final String NEW_FORMAT = "dd/MM/YYYY";
		String oldDateString = "";
		String newDateString = "";
		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		Date d = null;
		float minSalary = 0;
		float maxSalary = 0;
		
		TinTuyenDung tinTuyenDung = tinTuyenDungDAO.getChiTietTinTuyenDung(maTinTuyenDung);
		
		//format date yyyy-mm-dd to dd/mm/yyyy 
		oldDateString = tinTuyenDung.getNgayHetHan().trim();
		try {
			d = sdf.parse(oldDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdf.applyPattern(NEW_FORMAT);
		newDateString = sdf.format(d);
		tinTuyenDung.setNgayHetHan(newDateString);
		
		sdf.applyPattern(OLD_FORMAT);
		
		oldDateString = tinTuyenDung.getNgayDang().trim();
		try {
			d = sdf.parse(oldDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdf.applyPattern(NEW_FORMAT);
		newDateString = sdf.format(d);
		tinTuyenDung.setNgayDang(newDateString);
		
		// remove unnecessary zero decimal
		minSalary = Float.parseFloat(tinTuyenDung.getMucLuongToiThieu());
		if(minSalary == (int)minSalary) {
			tinTuyenDung.setMucLuongToiThieu(Integer.toString((int)minSalary));
		}
			
		// remove unnecessary zero decimal
		maxSalary = Float.parseFloat(tinTuyenDung.getMucLuongToiDa());
		if(maxSalary == (int)maxSalary) {
			tinTuyenDung.setMucLuongToiDa(Integer.toString((int)maxSalary));
		}
		return tinTuyenDung;
	}

	public void indexTinTuyenDung() {
		// TODO Auto-generated method stub
		
	}

	public void nopHoSo(String email, int maTinTuyenDung, TinTuyenDung tinTuyenDung) {

		tinTuyenDungDAO.nopHoSo(email, maTinTuyenDung, tinTuyenDung);
	}
	
	public List<TinTuyenDung> getTinUngTuyen(String email){
		return tinTuyenDungDAO.getTinUngTuyen(email);
	}
	
	public List<TinTuyenDung> getTinQuanTam(String email){
		return tinTuyenDungDAO.getTinQuanTam(email);
	}
	
	public void quanTam(String email, int maTinTuyenDung, TinTuyenDung tinTuyenDung) {

		tinTuyenDungDAO.quanTam(email, maTinTuyenDung, tinTuyenDung);
	}
	

}
