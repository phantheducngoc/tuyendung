package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OfferDAO;
import com.daoimpl.OfferImpl;
import com.entity.Offer;

@Service
public class OfferService implements OfferImpl{

	@Autowired
	OfferDAO offerDAO;
	
	public List<Offer> getOffer(int maUngVien) {
		
		List<Offer> listoffer = offerDAO.getOffer(maUngVien);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Date firstDate;
	    Date secondDate;
	    String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

		for(Offer offer: listoffer) {
			try {
				firstDate = sdf.parse(offer.getTinTuyenDung().getNgayHetHan());
				secondDate = sdf.parse(currentDate);
				long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
				long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
				offer.setRemainedDays(diff);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	    
	 
	   
	 
		return listoffer;
	}

}
