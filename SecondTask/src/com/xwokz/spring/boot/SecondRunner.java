package com.xwokz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwokz.spring.bean.Engine;
import com.xwokz.spring.bean.Newspaper;
import com.xwokz.spring.bean.Snake;
import com.xwokz.spring.configuration.SecondConfiguration;

public class SecondRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext spring =new AnnotationConfigApplicationContext(SecondConfiguration.class);
		Newspaper np=spring.getBean( Newspaper.class);
		System.out.println(np);
		
		Engine eng = spring.getBean(Engine.class);
		System.out.println(eng);
		
      Snake snk = spring.getBean(Snake.class);
		System.out.println(snk);

	}

}
