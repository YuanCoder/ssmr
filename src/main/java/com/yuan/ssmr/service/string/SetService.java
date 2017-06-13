package com.yuan.ssmr.service.string;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class SetService {
    
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	public StringRedisTemplate stringRedisTemplate;
	
	public void setValue(String key,String value){
		stringRedisTemplate.opsForValue().set(key, value);
		logger.info("set key:" + key + " value:" + value);

	}
}
