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
public class SetExService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;
	

	public void test(){
		stringRedisTemplate.execute(new Exrc());
	}
	
	
	
	
	private final class Exrc implements RedisCallback<Object>{
		public Object doInRedis(RedisConnection rc)
				throws DataAccessException {
			// TODO Auto-generated method stub
			String key ="fuck";
			String value="value";
			rc.setEx(key.getBytes(), 60, value.getBytes());
			return null;
		}
	}

	

}
