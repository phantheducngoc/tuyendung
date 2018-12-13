package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.daoimpl.MessageImpl;
import com.entity.Messages;
import com.entity.UngVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MessagesDAO implements MessageImpl {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<Messages> getReceivedMessages(UngVien ungVien) {

		Session session = sessionFactory.getCurrentSession();
		
		List<Messages> listMessages = session.createQuery("from messages where maUngVien = "+ungVien.getMaUngVien()+" and loaiThu = 0 and deleteStatus = 0 order by ngayGui DESC").getResultList();
		
		
		return listMessages;
	}

	@Transactional
	public List<Messages> getRepliedMessages(UngVien ungVien) {
		Session session = sessionFactory.getCurrentSession();
		
		List<Messages> listMessages = session.createQuery("from messages where maUngVien = "+ungVien.getMaUngVien()+" and loaiThu = 1 and deleteStatus = 0 order by ngayGui DESC").getResultList();
		
		
		return listMessages;
	}

	@Transactional
	public Messages getMessage(int id) {
		Session session = sessionFactory.getCurrentSession();
		Messages message = (Messages)session.createQuery("from messages where id = "+id).getSingleResult(); 
		return message;
	}

	
}
