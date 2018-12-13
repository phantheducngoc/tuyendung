package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "nganhnghe")
public class NganhNghe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNganhNghe;
	
	private String tenNganhNghe;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maLinhVuc")
	private LinhVuc linhVuc;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maNganhNghe")
	private Set<TinTuyenDung> tinTuyenDung;
	
	//getter setter
	public Set<TinTuyenDung> getTinTuyenDung() {
		return tinTuyenDung;
	}

	public void setTinTuyenDung(Set<TinTuyenDung> tinTuyenDung) {
		this.tinTuyenDung = tinTuyenDung;
	}

	public int getMaNganhNghe() {
		return maNganhNghe;
	}

	public void setMaNganhNghe(int maNganhNghe) {
		this.maNganhNghe = maNganhNghe;
	}

	public String getTenNganhNghe() {
		return tenNganhNghe;
	}

	public void setTenNganhNghe(String tenNganhNghe) {
		this.tenNganhNghe = tenNganhNghe;
	}

	public LinhVuc getLinhVuc() {
		return linhVuc;
	}

	public void setLinhVuc(LinhVuc linhVuc) {
		this.linhVuc = linhVuc;
	}
	
	
	
}
