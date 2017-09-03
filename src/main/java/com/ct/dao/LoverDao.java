package com.ct.dao;

import org.apache.ibatis.session.SqlSession;

import com.ct.entity.Lover;
import com.ct.util.MyBatisUtil;

public class LoverDao {
	
	private SqlSession sqlSession;
	
	/**
	 * 增加
	 */
	public void addLover(Lover lover) {
		sqlSession = MyBatisUtil.getSqlSession();
		
		int insertId = sqlSession.insert("lovernamespace.addLover", lover);
		
		sqlSession.commit();
		System.out.println(insertId);
	}
}
