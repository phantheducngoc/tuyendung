package com.entity;

import java.util.Set;

public class SearchForm {

	private String freeKeyword;
	private Set<Integer> maNganhNghe;
	
	public Set<Integer> getMaNganhNghe() {
		return maNganhNghe;
	}
	public void setMaNganhNghe(Set<Integer> maNganhNghe) {
		this.maNganhNghe = maNganhNghe;
	}
	public String getFreeKeyword() {
		return freeKeyword;
	}
	public void setFreeKeyword(String freeKeyword) {
		this.freeKeyword = freeKeyword;
	}
}
