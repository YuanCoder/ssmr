package com.yuan.ssmr.service.string;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class MgetService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;
	
	public void get(){
		 ValueOperations<String, String> vo = stringRedisTemplate.opsForValue();
		 List<String> cList = new ArrayList<String>();
		 cList.add("map1");
		 cList.add("map2");
		 List<String> mgetList = vo.multiGet(cList);
		 for(String t : mgetList){
			 logger.info(t);
		 }
	}

}
