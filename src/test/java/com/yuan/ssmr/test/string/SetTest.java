package com.yuan.ssmr.test.string;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yuan.ssmr.service.string.SetService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class SetTest {
	 
	@Resource
	private SetService setService;
	
	@Test
	public void setTest(){
		setService.setValue("name", "YuanCoder");
	}

}
