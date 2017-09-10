package com.ct.test;

import java.util.Random;

import com.ct.dao.LoverDao;
import com.ct.entity.Lover;
import com.ct.util.LoverUtil;

public class TestLoverDao {
	
	public static LoverDao loverDao = new LoverDao();
	
	public static void main(String[] args) {
		Lover lover = LoverUtil.getAExistLover();
		lover.setId(new Random().nextInt() );
//		
//		loverDao.addLover(lover);
		
		//查询操作
//		Lover lover = loverDao.selectLoverWithLikeAndHateListById(2); 
//		if(null != lover.getLikeAndHateList()) {
//			System.out.println(lover.getLikeAndHateList().getHate_drinkList());
//		}
		
		//增加操作
		loverDao.addLover(lover);
		
		
	}

}
