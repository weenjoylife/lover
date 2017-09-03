package com.ct.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ct.entity.LikeAndHateList;
import com.ct.entity.Lover;

public class LoverUtil {
	
	public static Lover getAExistLover() {
		Lover lover = new Lover();
//		lover.setId(1);
		lover.setHeight(163);
		lover.setName("zyx");
		lover.setSize(new String("32,32,32"));
		lover.setWeight(50);
		lover.setLocation("湘潭");
		
		String dateFromat = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFromat);
		String birthday = simpleDateFormat.format(new Date());
		lover.setBirthday(birthday);
		
		LikeAndHateList likeAndHateList = new LikeAndHateList();
		String[] like_eatList = {"爱吃","排骨"};
		likeAndHateList.setLike_eatList(like_eatList);
		String[] like_drinkList = {"爱喝","排骨"};
		likeAndHateList.setLike_drinkList(like_drinkList);
		String[] like_playList = {"爱玩","排骨"};
		likeAndHateList.setLike_playList(like_playList);
		String[] like_funList = {"爱fun?","排骨"};
		likeAndHateList.setLike_funList(like_funList);
		
		String[] hate_eatList = {"恨吃","排骨"};
		likeAndHateList.setHate_eatList(hate_eatList);
		String[] hate_drinkList = {"恨喝","排骨"};
		likeAndHateList.setHate_drinkList(hate_drinkList);
		String[] hate_playList = {"恨玩","排骨"};
		likeAndHateList.setHate_playList(hate_playList);
		String[] hate_funList = {"恨fun","排骨"};
		likeAndHateList.setHate_funList(hate_funList);
		
		String goalList = new String("环游世界,住在海边");
		lover.setGoalList(goalList);
		
		lover.setLikeAndHateList(likeAndHateList);
		
		return lover;
	}

}
