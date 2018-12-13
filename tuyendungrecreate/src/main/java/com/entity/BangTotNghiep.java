package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity(name="chitietbangtotnghiep")
public class BangTotNghiep {

	@Id
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy = "foreign", parameters = @Parameter(name="property", value="ungVien"))
	private int maUngVien;
	private String namNhapHoc;
	private String namTotNghiep;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maTruong")
	private TruongHoc truongHoc;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maNganh")
	private NganhHoc nganhHoc;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maTrinhDo")
	private TrinhDoHocVan trinhDoHocVan;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private UngVien ungVien;
	
	
	
	
	public int getMaUngVien() {
		return maUngVien;
	}

	public void setMaUngVien(int maUngVien) {
		this.maUngVien = maUngVien;
	}

	public UngVien getUngVien() {
		return ungVien;
	}

	public void setUngVien(UngVien ungVien) {
		this.ungVien = ungVien;
	}

	public String getNamNhapHoc() {
		return namNhapHoc;
	}

	public void setNamNhapHoc(String namNhapHoc) {
		this.namNhapHoc = namNhapHoc;
	}

	public String getNamTotNghiep() {
		return namTotNghiep;
	}

	public void setNamTotNghiep(String namTotNghiep) {
		this.namTotNghiep = namTotNghiep;
	}

	public TruongHoc getTruongHoc() {
		return truongHoc;
	}

	public void setTruongHoc(TruongHoc truongHoc) {
		this.truongHoc = truongHoc;
	}

	public NganhHoc getNganhHoc() {
		return nganhHoc;
	}

	public void setNganhHoc(NganhHoc nganhHoc) {
		this.nganhHoc = nganhHoc;
	}

	public TrinhDoHocVan getTrinhDoHocVan() {
		return trinhDoHocVan;
	}

	public void setTrinhDoHocVan(TrinhDoHocVan trinhDoHocVan) {
		this.trinhDoHocVan = trinhDoHocVan;
	}
}
