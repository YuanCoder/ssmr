package com.yuan.ssmr.test.string;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yuan.ssmr.service.string.MgetService;
import com.yuan.ssmr.service.string.MsetService;
import com.yuan.ssmr.service.string.SetExService;
import com.yuan.ssmr.service.string.SetNxService;
import com.yuan.ssmr.service.string.SetRangeService;
import com.yuan.ssmr.service.string.SetService;
import com.yuan.ssmr.service.string.StrLenService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class StringOperationTest {
	 
	@Resource
	private SetService setService;
	
	@Resource
	private MgetService mgetService;
	
	@Resource
	private MsetService msetService;
	
	@Resource
	private SetExService setExService;
	
	@Resource
	private SetNxService SetNxService;
	
	@Resource
	private SetRangeService  setRangeService;
	
	@Resource
	private StrLenService  strLenService;
	
	
	
	@Test
	public void setTest(){
		setService.setValue("name", "YuanCoder");
	}
	
	@Test
	public void msetTest(){
		msetService.test();
	}
	
	@Test
	public void mgetTest(){
		mgetService.get();
	}
	
	@Test
	public void setExTest(){
		setExService.test();
	}
	
	@Test
	public void setNxTest(){
		SetNxService.test();
	}
	
	@Test
	public void setRangeTest(){
		setRangeService.test();
	}
	
	@Test
	public void  strLenTest(){
		strLenService.test();
	}

}
