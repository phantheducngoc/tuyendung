package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="truonghoc")
public class TruongHoc {

	@Id
	private int maTruong;
	private String tenTruong;
	
	@OneToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name="maTruong")
	private Set<BangTotNghiep> listBangTotNghiep;
	
	public Set<BangTotNghiep> getListBangTotNghiep() {
		return listBangTotNghiep;
	}
	public void setListBangTotNghiep(Set<BangTotNghiep> listBangTotNghiep) {
		this.listBangTotNghiep = listBangTotNghiep;
	}
	public int getMaTruong() {
		return maTruong;
	}
	public void setMaTruong(int maTruong) {
		this.maTruong = maTruong;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
}
