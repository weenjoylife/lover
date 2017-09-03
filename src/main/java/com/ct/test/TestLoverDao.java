package com.ct.test;

import com.ct.dao.LoverDao;
import com.ct.entity.Lover;
import com.ct.util.LoverUtil;

public class TestLoverDao {
	
	public static LoverDao loverDao = new LoverDao();
	
	public static void main(String[] args) {
		Lover lover = LoverUtil.getAExistLover();
		
		loverDao.addLover(lover);
		
		
		
		
	}

}
