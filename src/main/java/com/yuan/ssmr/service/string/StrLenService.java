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
public class StrLenService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;
	
	public void test(){
		Long length = stringRedisTemplate.execute(new StrLenrc());
		logger.info("####" + length);
	}
	
	
	private final class StrLenrc implements RedisCallback<Long>{
		public Long doInRedis(RedisConnection rc) throws DataAccessException {
		    String key = "1";
		    Long length =  rc.strLen(key.getBytes());
			return length;
		}
	}

}
