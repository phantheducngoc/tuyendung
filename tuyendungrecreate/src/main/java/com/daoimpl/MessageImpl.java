package com.daoimpl;

import java.util.List;

import com.entity.Messages;
import com.entity.UngVien;

public interface MessageImpl {

	public List<Messages> getReceivedMessages(UngVien ungVien);
	public List<Messages> getRepliedMessages(UngVien ungVien);
	public Messages getMessage(int id);
}
