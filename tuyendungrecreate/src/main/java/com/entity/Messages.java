package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="messages")
public class Messages {

	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maUngVien")
	private UngVien ungVien;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maTinTuyenDung")
	private TinTuyenDung tinTuyenDung;
	
	private String subject;
	private String content;
	private String ngayGui;
	private int loaiThu;
	
	
	public TinTuyenDung getTinTuyenDung() {
		return tinTuyenDung;
	}
	public void setTinTuyenDung(TinTuyenDung tinTuyenDung) {
		this.tinTuyenDung = tinTuyenDung;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UngVien getUngVien() {
		return ungVien;
	}
	public void setUngVien(UngVien ungVien) {
		this.ungVien = ungVien;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNgayGui() {
		return ngayGui;
	}
	public void setNgayGui(String ngayGui) {
		this.ngayGui = ngayGui;
	}
	public int getLoaiThu() {
		return loaiThu;
	}
	public void setLoaiThu(int loaiThu) {
		this.loaiThu = loaiThu;
	}
}
