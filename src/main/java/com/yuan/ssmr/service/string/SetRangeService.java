package com.yuan.ssmr.service.string;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class SetRangeService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;
	
	public void test(){
		stringRedisTemplate.execute(new SetRangerc());	
	}
	
	
	private final class SetRangerc implements RedisCallback<String>{
		public String  doInRedis(RedisConnection rc)
				throws DataAccessException {
		    String key = "1";
		    rc.setRange(key.getBytes(),"2".getBytes(), 6);
			return null;
		}
	}


}
