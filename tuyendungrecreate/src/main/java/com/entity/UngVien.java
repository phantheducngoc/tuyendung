package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity(name="ungvien")
public class UngVien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maUngVien;
	private String tenUngVien;
	private String diaChi;
	private String dienThoai;
	private String hinhAnhCaNhan;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String password;
	
	@OneToOne(mappedBy="ungVien",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "maUngVien")
	private BangTotNghiep bangTotNghiep;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maTaiKhoan")
	private TaiKhoan taiKhoan;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name ="maThanhPho")
	private ThanhPho thanhPho;
	
	@OneToOne(mappedBy="ungVien", cascade = CascadeType.ALL)
	@JoinColumn(name="maUngVien")
	private HoSoUngVien hoSoUngVien;
	
	public HoSoUngVien getHoSoUngVien() {
		return hoSoUngVien;
	}
	public void setHoSoUngVien(HoSoUngVien hoSoUngVien) {
		this.hoSoUngVien = hoSoUngVien;
	}
	public BangTotNghiep getBangTotNghiep() {
		return bangTotNghiep;
	}
	public void setBangTotNghiep(BangTotNghiep bangTotNghiep) {
		this.bangTotNghiep = bangTotNghiep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public ThanhPho getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(ThanhPho thanhPho) {
		this.thanhPho = thanhPho;
	}
	public int getMaUngVien() {
		return maUngVien;
	}
	public void setMaUngVien(int maUngVien) {
		this.maUngVien = maUngVien;
	}
	public String getTenUngVien() {
		return tenUngVien;
	}
	public void setTenUngVien(String tenUngVien) {
		this.tenUngVien = tenUngVien;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getHinhAnhCaNhan() {
		return hinhAnhCaNhan;
	}
	public void setHinhAnhCaNhan(String hinhAnhCaNhan) {
		this.hinhAnhCaNhan = hinhAnhCaNhan;
	}
	
	
}
