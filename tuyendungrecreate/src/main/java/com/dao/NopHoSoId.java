package com.dao;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.entity.NhaTuyenDung;
import com.entity.TinTuyenDung;
import com.entity.UngVien;

@Embeddable
public class NopHoSoId implements Serializable{

	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maUngVien")
	private UngVien ungVien;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maNhaTuyenDung")
	private NhaTuyenDung nhaTuyenDung;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maTinTuyenDung")
	private TinTuyenDung tinTuyenDung;
	public UngVien getUngVien() {
		return ungVien;
	}
	public void setUngVien(UngVien ungVien) {
		this.ungVien = ungVien;
	}
	public NhaTuyenDung getNhaTuyenDung() {
		return nhaTuyenDung;
	}
	public void setNhaTuyenDung(NhaTuyenDung nhaTuyenDung) {
		this.nhaTuyenDung = nhaTuyenDung;
	}
	public TinTuyenDung getTinTuyenDung() {
		return tinTuyenDung;
	}
	public void setTinTuyenDung(TinTuyenDung tinTuyenDung) {
		this.tinTuyenDung = tinTuyenDung;
	}
	
	
}
