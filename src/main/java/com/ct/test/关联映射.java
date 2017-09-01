package com.ct.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class 关联映射 {
	
	/**
	 * 一对一映射
	 * @return
	 */
	public List<Student> selectAllStudentWithCard() {
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<Student> studentList = sqlSession.selectList("studentnamespace.selectAllStudentWithCard");
		
		return studentList;
		
	}
	
	public Order selectOrderAndProductById(int id){
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		Order order = sqlSession.selectOne("ordernamespace.selectAllOrderAndProductById",id);
		
		return order;
		
	}

	public static void main(String[] args) throws Exception{
		关联映射 dao = new 关联映射();
		List<Student> studentList = dao.selectAllStudentWithCard();
		for(Student st : studentList) {
			System.out.println(st.getId() + " " + st.getName()
			+ "  身份证号码id:" + st.getCard().getId()
			+ "  身份证号码:" + st.getCard().getNum());
		}
		
		Order order = dao.selectOrderAndProductById(1);
		System.out.println(order.getName());
		List<Product> productList = order.getProductList();
			for(Product p :productList) {
				System.out.println(p.getName() + " " + p.getId() + " orderId:" + p.getOrder().getId());
			}
		}
	}

