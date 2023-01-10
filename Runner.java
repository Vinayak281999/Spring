package com.xworkz.springs.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.bean.Actor;
import com.xworkz.springs.bean.Rocket;
import com.xworkz.springs.bean.Season;
import com.xworkz.springs.configuration.Comconfiguration;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext spring = new AnnotationConfigApplicationContext(Comconfiguration.class);

		
		Rocket rocket=spring.getBean("rocket",Rocket.class);
		System.out.println(rocket);
		 System.out.println(rocket.getName());
		 System.out.println(rocket.getCountry());
		System.out.println(rocket.getBudget());
		
		Rocket rocket1=spring.getBean("rocket",Rocket.class);
		System.out.println(rocket);
		System.out.println(rocket1.getName());
		System.out.println(rocket1.getCountry());
		System.out.println(rocket1.getBudget());

		
		Actor actor=spring.getBean("actor",Actor.class);
		System.out.println(actor);
		System.out.println(actor.getName());
		System.out.println(actor.getLanguage());
		System.out.println(actor.getAge());
		
		Actor actor1=spring.getBean("actor",Actor.class);
		System.out.println(actor1);
		System.out.println(actor1.getName());
		System.out.println(actor1.getLanguage());
		System.out.println(actor1.getAge());
		
		Season sn=spring.getBean("season",Season.class);
	    System.out.println(sn);
	    System.out.println(sn.getName());
	    System.out.println(sn.getDuration());
	    System.out.println(sn.getStartingMonth());

	    Season sea=spring.getBean("season",Season.class);
	    System.out.println(sea);
	    System.out.println(sea.getName());
	    System.out.println(sea.getDuration());
	    System.out.println(sea.getStartingMonth());

	}

}
