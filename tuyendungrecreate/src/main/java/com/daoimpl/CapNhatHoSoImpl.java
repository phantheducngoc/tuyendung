package com.daoimpl;

import com.entity.UngVien;

public interface CapNhatHoSoImpl {
	
	public UngVien getThongTin(String email);
	public void updateProfile(UngVien ungVien, String email);
	public void updateEducation(UngVien ungVien,String email);

}
