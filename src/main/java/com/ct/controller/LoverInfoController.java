package com.ct.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ct.entity.LikeAndHateList;
import com.ct.entity.Lover;
import com.ct.entity.User;
import com.ct.service.LoverService;
import com.ct.service.LoverServiceImpl;

@Controller
public class LoverInfoController {
	
	@Autowired
	private LoverServiceImpl loverService;
	
	@RequestMapping(value="/love/showLoverInfo")
	@ResponseBody
	public Lover showLoverInfo() {
		
//		Lover lover = new Lover();
//		lover.setId(1);
//		lover.setHeight(163);
//		lover.setName("zyx");
//		lover.setSize(new String("32,32,32"));
//		lover.setWeight(50);
//		lover.setLocation("湘潭");
//		
//		String dateFromat = "yyyy-MM-dd";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFromat);
//		String birthday = simpleDateFormat.format(new Date());
//		lover.setBirthday(birthday);
//		
//		LikeAndHateList likeAndHateList = new LikeAndHateList();
//		String like_eatList = "爱吃,排骨";
//		likeAndHateList.setLike_eatList(like_eatList);
//		String like_drinkList = "爱吃,排骨";
//		likeAndHateList.setLike_drinkList(like_drinkList);
//		String like_playList ="爱吃,排骨";
//		likeAndHateList.setLike_playList(like_playList);
//		String like_funList = "爱吃,排骨";
//		likeAndHateList.setLike_funList(like_funList);
//		
//		String hate_eatList = "爱吃,排骨";
//		likeAndHateList.setHate_eatList(hate_eatList);
//		String hate_drinkList = "爱吃,排骨";
//		likeAndHateList.setHate_drinkList(hate_drinkList);
//		String hate_playList = "爱吃,排骨";
//		likeAndHateList.setHate_playList(hate_playList);
//		String hate_funList = "爱吃,排骨";
//		likeAndHateList.setHate_funList(hate_funList);
//		
//		String goalList = new String("环游世界,住在海边");
//		lover.setGoalList(goalList);
//		
//		lover.setLikeAndHateList(likeAndHateList);
		int id = 1;
		
		
		
		return loverService.selectLoverById(id);
		
	}
	//headers = "Accept=application/x-www-form-urlencoded"
	@RequestMapping(value="/love/saveBasicField", method=RequestMethod.POST)
	public void saveBasicField(Lover lover) {
		System.out.println("生日： " + lover.getBirthday());
		System.out.println("体重: " + lover.getWeight());
		System.out.println("身高: " + lover.getHeight());
		System.out.println("生产地: " + lover.getLocation());
		
		
		Lover oldLover = loverService.selectLoverById(lover.getId());
		LikeAndHateList likeAndHateList = oldLover.getLikeAndHateList();
		lover.setLikeAndHateList(likeAndHateList);
		
		loverService.updateLoverBasicField(lover);
		
//		float xw = lover.getSize()[0];
//		float yw = lover.getSize()[1];
//		float tw = lover.getSize()[2];
//		
//		System.out.println("胸围: " + xw);
//		System.out.println("腰围: " + yw);
//		System.out.println("臀围: " + tw);
		
//		System.out.println(height);
	}
	
	@RequestMapping(value="/love/saveAdvanceField", method=RequestMethod.POST)
	public void saveAdvanceField(Lover lover){
		if(lover != null) {
			System.out.println(lover.toString());
			System.out.println(lover.getLikeAndHateList().getHate_drinkList().toString());
//			System.out.println(lover.getLikeAndHateList().getHate_drinkList()[0]);
//			System.out.println(lover.getLikeAndHateList().getHate_drinkList()[1]);
			System.out.println(lover.toString());
			
			Lover oldLover = loverService.selectLoverById(lover.getId());
			
			lover.getLikeAndHateList().setId(oldLover.getLikeAndHateList().getId());
			
			lover.setBirthday(oldLover.getBirthday());
			lover.setHeight(oldLover.getHeight());
			lover.setWeight(oldLover.getWeight());
			lover.setLocation(oldLover.getLocation());
			lover.setSize(oldLover.getSize());
			lover.setName(oldLover.getName());
			lover.setGoalList(oldLover.getGoalList());
			
			loverService.updateLoverAdvanceField(lover);
		}
		else {
			System.out.println("lover is null!!");
		}
		
	}

}






