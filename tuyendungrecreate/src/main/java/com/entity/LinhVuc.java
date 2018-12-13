package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="linhvuc")
public class LinhVuc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLinhVuc;
	private String tenLinhVuc;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maLinhVuc")
	private Set<NganhNghe> nganhNghe;
	
	
	public Set<NganhNghe> getNganhNghe() {
		return nganhNghe;
	}
	public void setNganhNghe(Set<NganhNghe> nganhNghe) {
		this.nganhNghe = nganhNghe;
	}
	public int getMaLinhVuc() {
		return maLinhVuc;
	}
	public void setMaLinhVuc(int maLinhVuc) {
		this.maLinhVuc = maLinhVuc;
	}
	public String getTenLinhVuc() {
		return tenLinhVuc;
	}
	public void setTenLinhVuc(String tenLinhVuc) {
		this.tenLinhVuc = tenLinhVuc;
	}
	
	
}
