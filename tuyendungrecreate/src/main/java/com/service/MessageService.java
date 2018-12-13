package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MessagesDAO;
import com.daoimpl.MessageImpl;
import com.entity.Messages;
import com.entity.UngVien;

@Service
public class MessageService implements MessageImpl {

	@Autowired
	MessagesDAO messagesDAO;

	public List<Messages> getReceivedMessages(UngVien ungVien) {
		return messagesDAO.getReceivedMessages(ungVien);
	}

	public List<Messages> getRepliedMessages(UngVien ungVien) {
		return messagesDAO.getRepliedMessages(ungVien);
	}

	public Messages getMessage(int id) {
		return messagesDAO.getMessage(id);
	}
	
	
}
