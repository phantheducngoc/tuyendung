package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="tinh")
public class Tinh {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String maTinh;
	private String tenTinh;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="maTinh")
	private Set<ThanhPho> listThanhPho;
	
	
	public Set<ThanhPho> getListThanhPho() {
		return listThanhPho;
	}
	public void setListThanhPho(Set<ThanhPho> listThanhPho) {
		this.listThanhPho = listThanhPho;
	}
	public String getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}
	public String getTenTinh() {
		return tenTinh;
	}
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	
	
}
