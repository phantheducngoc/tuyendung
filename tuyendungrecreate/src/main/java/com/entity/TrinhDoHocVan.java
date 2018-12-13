package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="trinhdohocvan")
public class TrinhDoHocVan {

	@Id
	private int maTrinhDo;
	private String tenTrinhDo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maTrinhDo")
	private Set<BangTotNghiep> listBangTotNghiep;
	
	public Set<BangTotNghiep> getListBangTotNghiep() {
		return listBangTotNghiep;
	}
	public void setListBangTotNghiep(Set<BangTotNghiep> listBangTotNghiep) {
		this.listBangTotNghiep = listBangTotNghiep;
	}
	public int getMaTrinhDo() {
		return maTrinhDo;
	}
	public void setMaTrinhDo(int maTrinhDo) {
		this.maTrinhDo = maTrinhDo;
	}
	public String getTenTrinhDo() {
		return tenTrinhDo;
	}
	public void setTenTrinhDo(String tenTrinhDo) {
		this.tenTrinhDo = tenTrinhDo;
	}
}
