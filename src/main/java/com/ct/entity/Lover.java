package com.ct.entity;

import java.util.Arrays;

public class Lover {
	
	private int id;
	private String name;
	private String birthday;
	private int height;
	private float weight;
//	private float[] size;
	private String size;
	private String location;
	private LikeAndHateList likeAndHateList;
	
//	private String[] goalList;
	private String goalList;
	
	
	public String getGoalList() {
		return goalList;
	}

	public void setGoalList(String goalList) {
		this.goalList = goalList;
	}

	

	public Lover() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

//	public float[] getSize() {
//		return size;
//	}
//
//	public void setSize(float[] size) {
//		this.size = size;
//	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LikeAndHateList getLikeAndHateList() {
		return likeAndHateList;
	}

	public void setLikeAndHateList(LikeAndHateList likeAndHateList) {
		this.likeAndHateList = likeAndHateList;
	}

	@Override
	public String toString() {
		return "Lover [id=" + id + ", name=" + name + ", birthday=" + birthday + ", height=" + height + ", weight="
				+ weight + ", size=" + size + ", location=" + location + ", likeAndHateList="
				 + ", goalList=" + goalList + "]";
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	

}
