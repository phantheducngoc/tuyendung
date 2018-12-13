package com.daoimpl;

import java.util.List;

import com.entity.SearchForm;
import com.entity.TinTuyenDung;

public interface TinTuyenDungImpl {
	
	public List<TinTuyenDung> getListTinTuyenDung(SearchForm searchForm);
	public TinTuyenDung getChiTietTinTuyenDung(int maTinTuyenDung);
	public void nopHoSo(String email, int maTinTuyenDung, TinTuyenDung tinTuyenDung);
	public void quanTam(String email, int maTinTuyenDung, TinTuyenDung tinTuyenDung);
	public void indexTinTuyenDung();
	public List<TinTuyenDung> getTinUngTuyen(String email);
	public List<TinTuyenDung> getTinQuanTam(String email);
}