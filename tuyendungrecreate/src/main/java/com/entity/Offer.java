package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity(name="offer")
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maTinTuyenDung")
	private TinTuyenDung tinTuyenDung;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maUngVien")
	private UngVien ungVien;
	
	private String hinhAnh;
	private String ngayGui;
	private String header;
	private String content;
	
	@Transient
	private long remainedDays;
	
	public long getRemainedDays() {
		return remainedDays;
	}
	public void setRemainedDays(long remainedDays) {
		this.remainedDays = remainedDays;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TinTuyenDung getTinTuyenDung() {
		return tinTuyenDung;
	}
	public void setTinTuyenDung(TinTuyenDung tinTuyenDung) {
		this.tinTuyenDung = tinTuyenDung;
	}
	public UngVien getUngVien() {
		return ungVien;
	}
	public void setUngVien(UngVien ungVien) {
		this.ungVien = ungVien;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getNgayGui() {
		return ngayGui;
	}
	public void setNgayGui(String ngayGui) {
		this.ngayGui = ngayGui;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String conten) {
		this.content = conten;
	}
	
	
	
}
