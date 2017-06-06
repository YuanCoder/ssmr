package com.yuan.ssmr.controller;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuan.ssmr.entity.people;

@Controller
@RequestMapping("/test")
public class TestController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	public StringRedisTemplate stringRedisTemplate;
	
	@Resource
	public RedisTemplate<String, people> redisTemplate;
	
	@RequestMapping(value="/sdr",method=RequestMethod.GET)
	public void testRedis(){
		stringRedisTemplate.opsForValue().set("15873268311", "1111111", 60*10, TimeUnit.SECONDS);
		logger.info(stringRedisTemplate.opsForValue().get("15873268311"));
  		redisTemplate.opsForValue().set("Yuan", new people("yuan", "codder", "123232e"));
	}
}