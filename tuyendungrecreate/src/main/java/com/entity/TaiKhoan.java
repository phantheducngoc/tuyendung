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

@Entity(name="taikhoan")
public class TaiKhoan {

	//variable
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maTaiKhoan;
	
	private String tenLoaiTaiKhoan;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="maTaiKhoan")
	private Set<NhaTuyenDung> listNhaTuyenDung;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name ="maTaiKhoan")
	private Set<UngVien> listUngVien;
	
	
	public Set<NhaTuyenDung> getListNhaTuyenDung() {
		return listNhaTuyenDung;
	}
	public void setListNhaTuyenDung(Set<NhaTuyenDung> listNhaTuyenDung) {
		this.listNhaTuyenDung = listNhaTuyenDung;
	}
	public Set<UngVien> getListUngVien() {
		return listUngVien;
	}
	public void setListUngVien(Set<UngVien> listUngVien) {
		this.listUngVien = listUngVien;
	}
	public int getMaTaiKhoan() {
		return maTaiKhoan;
	}
	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}
	public String getTenLoaiTaiKhoan() {
		return tenLoaiTaiKhoan;
	}
	public void setTenLoaiTaiKhoan(String tenLoaiTaiKhoan) {
		this.tenLoaiTaiKhoan = tenLoaiTaiKhoan;
	}
	
}
