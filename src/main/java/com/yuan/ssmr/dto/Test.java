package com.yuan.ssmr.dto;

import java.lang.reflect.Field;

public class Test {
	public static void reflect(IEntity e) throws Exception{  
        Class cls = e.getClass();  
        Field[] fields = cls.getDeclaredFields();  
        for(int i=0; i<fields.length; i++){  
            Field f = fields[i];  
            f.setAccessible(true);  
            System.out.println("属性名:" + f.getName() + " 属性值:" + f.get(e));  
        }   
    }  
      
    public static void main(String[] args) throws Exception{  
        IEntity e = new Entity();  
        reflect(e);  
    }  
}

interface IEntity{  
	  
}  
  
class Entity implements IEntity{  
    private String answer1 = "字符串1";  
  
    private String answer2 = "字符串2";  
}  
  