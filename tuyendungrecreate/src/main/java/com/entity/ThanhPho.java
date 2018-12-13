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

@Entity(name="thanhpho")
public class ThanhPho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String maThanhPho;
	private String tenThanhPho;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maTinh")
	private Tinh tinh;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="maThanhPho")
	private Set<UngVien> listUngVien;
	
	public Set<UngVien> getListUngVien() {
		return listUngVien;
	}
	public void setListUngVien(Set<UngVien> listUngVien) {
		this.listUngVien = listUngVien;
	}
	public Tinh getTinh() {
		return tinh;
	}
	public void setTinh(Tinh tinh) {
		this.tinh = tinh;
	}
	public String getMaThanhPho() {
		return maThanhPho;
	}
	public void setMaThanhPho(String maThanhPho) {
		this.maThanhPho = maThanhPho;
	}
	public String getTenThanhPho() {
		return tenThanhPho;
	}
	public void setTenThanhPho(String tenThanhPho) {
		this.tenThanhPho = tenThanhPho;
	}
	
	
	
}
