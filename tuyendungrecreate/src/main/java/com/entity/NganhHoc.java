package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="nganhhoc")
public class NganhHoc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNganh;
	
	private String tenNganh;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maNganh")
	private Set<BangTotNghiep> listBangTotNghiep;
	
	public Set<BangTotNghiep> getListBangTotNghiep() {
		return listBangTotNghiep;
	}
	public void setListBangTotNghiep(Set<BangTotNghiep> listBangTotNghiep) {
		this.listBangTotNghiep = listBangTotNghiep;
	}
	public int getMaNganh() {
		return maNganh;
	}
	public void setMaNganh(int maNganh) {
		this.maNganh = maNganh;
	}
	public String getTenNganh() {
		return tenNganh;
	}
	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}
	
}
