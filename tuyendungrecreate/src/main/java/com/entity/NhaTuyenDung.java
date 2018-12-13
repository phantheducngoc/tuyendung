package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;



@Entity(name="nhatuyendung")
public class NhaTuyenDung {

	//variable
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNhaTuyenDung;
	
	@Column(nullable= true, length = 45)
	private String tenDangKiHopPhap;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name="maNhaTuyenDung")
	Set<TinTuyenDung> tinTuyenDungs;
	
	@Transient
	String error;
	
	private String diaChi;
	
	private String email;
	
	private String nguoiDaiDien;
	
	private String password;
	
	private String soDienThoai;
	
	private String thongTinBoSung;
	
	private Long vonDieuLe;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "maThanhPho")
	private ThanhPho thanhPho;
	
	public ThanhPho getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(ThanhPho thanhPho) {
		this.thanhPho = thanhPho;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNguoiDaiDien() {
		return nguoiDaiDien;
	}
	public void setNguoiDaiDien(String nguoiDaiDien) {
		this.nguoiDaiDien = nguoiDaiDien;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getThongTinBoSung() {
		return thongTinBoSung;
	}
	public void setThongTinBoSung(String thongTinBoSung) {
		this.thongTinBoSung = thongTinBoSung;
	}
	public Long getVonDieuLe() {
		return vonDieuLe;
	}
	public void setVonDieuLe(Long vonDieuLe) {
		this.vonDieuLe = vonDieuLe;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	//getter setter
	public Set<TinTuyenDung> getTinTuyenDungs() {
		return tinTuyenDungs;
	}
	public void setTinTuyenDungs(Set<TinTuyenDung> tinTuyenDungs) {
		this.tinTuyenDungs = tinTuyenDungs;
	}
	public int getMaNhaTuyenDung() {
		return maNhaTuyenDung;
	}
	public void setMaNhaTuyenDung(int maNhaTuyenDung) {
		this.maNhaTuyenDung = maNhaTuyenDung;
	}
	public String getTenDangKiHopPhap() {
		return tenDangKiHopPhap;
	}
	public void setTenDangKiHopPhap(String tenDangKiHopPhap) {
		this.tenDangKiHopPhap = tenDangKiHopPhap;
	}
	
	
	
}
