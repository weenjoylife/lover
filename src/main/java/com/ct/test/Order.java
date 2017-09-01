package com.ct.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 班级（单方）
 * @author AdminTC
 */
public class Order {
	private Integer id;
	private String name;
	private List<Product> productList = new ArrayList<Product>();
	public Order(){}
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
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}

