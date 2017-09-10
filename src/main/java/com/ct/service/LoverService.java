package com.ct.service;

import com.ct.entity.Lover;

public interface LoverService {
	
	public Lover selectLoverById(int id);
	
	public void addLover(Lover lover);

}
