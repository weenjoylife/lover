package com.ct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.dao.LoverDao;
import com.ct.entity.Lover;

@Service
public class LoverServiceImpl implements LoverService {
	
	@Autowired
	private LoverDao loverDao;

	public Lover selectLoverById(int id) {
		Lover lover = loverDao.selectLoverWithLikeAndHateListById(id);
		return lover;
	}

	public void addLover(Lover lover) {
		loverDao.addLover(lover);
		
	}
	
	public void updateLoverBasicField(Lover lover) {
		loverDao.updateLoverBasicField(lover);
	}

	public void updateLoverAdvanceField(Lover lover) {
		loverDao.updateLoverAdvanceField(lover);
	}
}
