package com.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.dao.NopHoSoId;

@Entity(name = "nophoso")
public class NopHoSo {

	@EmbeddedId
	NopHoSoId id;
	
	public NopHoSoId getId() {
		return id;
	}
	public void setId(NopHoSoId id) {
		this.id = id;
	}
	
}
