package com.ct.entity;

public class LikeAndHateList {
	
	private int id;
	private Lover lover;
	private int LoverId;
	
	public int getLoverId() {
		return LoverId;
	}
	public void setLoverId(int loverId) {
		LoverId = loverId;
	}
	public Lover getLover() {
		return lover;
	}
	public void setLover(Lover lover) {
		this.lover = lover;
	}
	private String like_eatList;
	private String like_drinkList;
	private String like_playList;
	private String like_funList;
	
	private String hate_eatList;
	private String hate_drinkList;
	private String hate_playList;
	private String hate_funList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLike_eatList() {
		return like_eatList;
	}
	public void setLike_eatList(String like_eatList) {
		this.like_eatList = like_eatList;
	}
	public String getLike_drinkList() {
		return like_drinkList;
	}
	public void setLike_drinkList(String like_drinkList) {
		this.like_drinkList = like_drinkList;
	}
	public String getLike_playList() {
		return like_playList;
	}
	public void setLike_playList(String like_playList) {
		this.like_playList = like_playList;
	}
	public String getLike_funList() {
		return like_funList;
	}
	public void setLike_funList(String like_funList) {
		this.like_funList = like_funList;
	}
	public String getHate_eatList() {
		return hate_eatList;
	}
	public void setHate_eatList(String hate_eatList) {
		this.hate_eatList = hate_eatList;
	}
	public String getHate_drinkList() {
		return hate_drinkList;
	}
	public void setHate_drinkList(String hate_drinkList) {
		this.hate_drinkList = hate_drinkList;
	}
	public String getHate_playList() {
		return hate_playList;
	}
	public void setHate_playList(String hate_playList) {
		this.hate_playList = hate_playList;
	}
	public String getHate_funList() {
		return hate_funList;
	}
	public void setHate_funList(String hate_funList) {
		this.hate_funList = hate_funList;
	}
	public LikeAndHateList() {
		super();
	}

	
	

}
