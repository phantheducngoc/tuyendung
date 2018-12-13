package com.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TrinhDoHocVanDAO;
import com.daoimpl.TrinhDoHocVanImpl;
import com.entity.TrinhDoHocVan;

@Service
public class TrinhDoHocVanService{

	@Autowired
	TrinhDoHocVanDAO trinhDoHocVanDAO;
	
	public Map<String,String> getTrinhDo() {
		Map<String ,String> mapTrinhDo = new LinkedHashMap<String, String>();
		for(TrinhDoHocVan trinhDo : trinhDoHocVanDAO.getTrinhDo()){
			mapTrinhDo.put(""+trinhDo.getMaTrinhDo(), trinhDo.getTenTrinhDo());
		}
		return mapTrinhDo;
	}

}
