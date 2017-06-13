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
public class SetNxService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;
	
		
	public void test(){
		String value = stringRedisTemplate.execute(new SetNxrc());
		logger.info(value);
	}
	
	
	private final class SetNxrc implements RedisCallback<String>{
		public String  doInRedis(RedisConnection rc) throws DataAccessException {
			String key = "not exists";
			String value = "not exists value";
			rc.setNX(key.getBytes(), value.getBytes());
			return null;
		}
	}


}
