package com.ct.test;

/**
 * 学生（多方）
 * @author AdminTC
 */
public class Product {
	private Integer id;
	private String name;
	private Order order;
	public Product(){}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}

