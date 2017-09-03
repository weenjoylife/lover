package com.ct.dao;

import org.apache.ibatis.session.SqlSession;

import com.ct.entity.LikeAndHateList;
import com.ct.util.MyBatisUtil;

public class LikeAndHateListDao {
	
	private SqlSession sqlSession;
	
	/**
	 * 增加
	 */

	public void addLikeAndHateList(LikeAndHateList likeAndHateLis) {
		sqlSession = MyBatisUtil.getSqlSession();
		
		int insertId = sqlSession.insert("likeAndHateListnamespace.addLikeAndHateList",likeAndHateLis);
		
		sqlSession.commit();
		System.out.println(insertId);
	}
}
