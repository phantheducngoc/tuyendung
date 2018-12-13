package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="tintuyendung")
public class TinTuyenDung {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maTinTuyenDung;
	
	@Column(nullable= true, length = 45)
	private String moTa;
	
	@Column(nullable= true, length = 45)
	private String chucDanh;
	
	@Column(nullable= true, length = 10)
	private String mucLuongToiThieu;
	
	@Column(nullable= true, length = 10)
	private String mucLuongToiDa;
	
	@Column(nullable= true)
	private String ngayHetHan;
	
	@Column(nullable= true)
	private String ngayDang;
	
	@Column(nullable= true, length = 45)
	private String hinhAnh;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maNganhNghe")
	private NganhNghe nganhNghe;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "maNhaTuyenDung")
    private NhaTuyenDung nhaTuyenDung;
	
	//getter setter
	public String getHinhAnh() {
		return hinhAnh;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public NganhNghe getNganhNghe() {
		return nganhNghe;
	}
	public void setNganhNghe(NganhNghe nganhNghe) {
		this.nganhNghe = nganhNghe;
	}
	public NhaTuyenDung getNhaTuyenDung() {
		return nhaTuyenDung;
	}
	public void setNhaTuyenDung(NhaTuyenDung nhaTuyenDung) {
		this.nhaTuyenDung = nhaTuyenDung;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(String ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public String getNgayDang() {
		return ngayDang;
	}
	public void setNgayDang(String ngayDang) {
		this.ngayDang = ngayDang;
	}
	public int getMaTinTuyenDung() {
		return maTinTuyenDung;
	}
	public void setMaTinTuyenDung(int maTinTuyenDung) {
		this.maTinTuyenDung = maTinTuyenDung;
	}
	public String getMota() {
		return moTa;
	}
	public void setMota(String mota) {
		this.moTa = mota;
	}
	public String getChucDanh() {
		return chucDanh;
	}
	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}
	public String getMucLuongToiThieu() {
		return mucLuongToiThieu;
	}
	public void setMucLuongToiThieu(String mucLuongToiThieu) {
		this.mucLuongToiThieu = mucLuongToiThieu;
	}
	public String getMucLuongToiDa() {
		return mucLuongToiDa;
	}
	public void setMucLuongToiDa(String mucLuongToiDa) {
		this.mucLuongToiDa = mucLuongToiDa;
	}
}
