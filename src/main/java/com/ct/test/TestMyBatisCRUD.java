package com.ct.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ct.util.MyBatisUtil;

public class TestMyBatisCRUD {
	
	/**
	 * 增加单个对象（无参）
	 */
	public void add1() throws Exception{
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		try{
			sqlSession.insert("mynamespace.add1");
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			sqlSession.commit();
		}
		MyBatisUtil.closeSqlSession();
	}
	/**
	 * 增加单个对象（有参）
	 */
	public void add2(User user) throws Exception{
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		try{
			sqlSession.insert("mynamespace.add2",user);
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			sqlSession.commit();
		}
		MyBatisUtil.closeSqlSession();
	}
	
	public static void main(String[] args) throws Exception{
		TestMyBatisCRUD dao = new TestMyBatisCRUD();
		
		User user2 = new User();
		user2.setName("zxx");
		user2.setSex("M");
		user2.setAge(18);
		dao.add2(user2);
		
		User user = dao.selectUserById(1);
		System.out.println(user.toString());
		
		List<User> userList = dao.selectAllUser();
		for(User user21 : userList) {
			System.out.println(user21.getId() + " " +user21.getName());
		}
		User user4update = dao.selectUserById(4);
		user4update.setAge(77);
		user4update.setName("nameAfterUpdate");
		user4update.setSex("F");
		dao.updateUser(user4update);
	}
	
	/**
	 * 查询单个对象
	 */
	public User selectUserById(Integer id) {
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		User user = (User)sqlSession.selectOne("mynamespace.selectUserById", id);
		
		return user;
		
	}
	
	
	/**
	 * 查询对象集合
	 */
	public List<User> selectAllUser() {
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<User> userList = sqlSession.selectList("mynamespace.selectAllUser");
		
		return userList;
		
	}
	
	/**
	 * 修改
	 * 修改的业务流程是：
	 * 根据某个条件查询出一些对象，再通过的对象的set方法修改对象属性，最后将该对象保存回数据库
	 */
	public void updateUser(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		sqlSession.update("mynamespace.updateUser", user);
		sqlSession.commit();
	}
}
