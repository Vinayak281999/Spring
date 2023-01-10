package com.xworkz.springs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springs.bean.Actor;
import com.xworkz.springs.bean.Rocket;
import com.xworkz.springs.bean.Season;

@Configuration
@ComponentScan("com.xworkz.springs")
public class Comconfiguration {
	
	 @Bean 
	  public Rocket rocket()
	  {
	  System.out.println("rocket at Bean");
	  Rocket rocket=new Rocket();
	  rocket.getName();
	  rocket.getCountry();
	  rocket.getBudget();
	  return rocket; 
	  }
	 
	 @Bean
	  public Actor acting()
	  {
		  System.out.println("actor at Bean");
		  Actor actor=new Actor("Shankar Nag","kannada",45);
		  actor.getName();
		  actor.getLanguage();
		  actor.getAge();
		  return actor;

	  }
	 @Bean
	 public Season season()
	 {
		 System.out.println("Season at Bean");
		 Season sea=new Season();
		 sea.setName("winter");
		 sea.getName();
		 sea.setDuration("3 month");
		 sea.getDuration();
		 sea.setStartingMonth("jun");
		 sea.getStartingMonth();
		return sea;
	 }


}
