package com.ct.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ct.entity.LikeAndHateList;
import com.ct.entity.Lover;
import com.ct.util.MyBatisUtil;

@Repository
public class LoverDao {
	
	private SqlSession sqlSession;
	private LikeAndHateListDao andHateListDao = new LikeAndHateListDao();
	
	/**
	 * 增加
	 */
	public void addLover(Lover lover) {
		sqlSession = MyBatisUtil.getSqlSession();
		
		if(null == lover) {
			System.out.println("Lover为空");
		}else {
			System.out.println("Lover不为空");
		}
		
		
		int insertId = sqlSession.insert("lovernamespace.addLover", lover);
		System.out.println("====");
		
		LikeAndHateList likeAndHateList = lover.getLikeAndHateList();
		if(null != likeAndHateList) {
			System.out.println("+++");
		}
		likeAndHateList.setLoverId(lover.getId());
		
		andHateListDao.addLikeAndHateList(likeAndHateList);
		
		sqlSession.commit();
		sqlSession.close();
		System.out.println(insertId);
	}
	
	/**
	 * 查询lover，不带LikeAndHateList属性
	 */
	public Lover selectLoverWithoutLikeAndHateListById(int id) {
		sqlSession = MyBatisUtil.getSqlSession();
		return sqlSession.selectOne("lovernamespace.selectLoverWithoutLikeAndHateList", id);
	}
	
	/**
	 * 查询lover，带LikeAndHateList属性
	 */
	public Lover selectLoverWithLikeAndHateListById(int id) {
		sqlSession = MyBatisUtil.getSqlSession();
		return sqlSession.selectOne("lovernamespace.selectLoverWithLikeAndHateList", id);
	}
	
	
	public void updateLoverBasicField(Lover lover) {
		sqlSession = MyBatisUtil.getSqlSession();
		sqlSession.update("lovernamespace.updateLoverBasicField", lover);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void updateLoverAdvanceField(Lover lover) {
		sqlSession = MyBatisUtil.getSqlSession();
		sqlSession.update("lovernamespace.updateLoverBasicField", lover);
		sqlSession.update("likeAndHateListnamespace.updateLoverAdvanceField", lover.getLikeAndHateList());
		sqlSession.commit();
		sqlSession.close();
	}
}
