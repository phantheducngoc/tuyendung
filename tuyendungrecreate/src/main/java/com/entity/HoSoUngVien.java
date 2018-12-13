package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity(name = "hosoungvien")
public class HoSoUngVien {

	@Id
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy = "foreign", parameters = @Parameter(name="property",value="ungVien"))
	private int maUngVien;
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
}
