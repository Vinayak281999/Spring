package com.xwokz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xwokz.spring")
public class SecondConfiguration {
	public  SecondConfiguration() {
		System.out.println("Create the SecondConfiguration");
	}
	@Bean
public String name() {
	System.out.println("name at SecondConfiguration");
	return "TheHindu";
		}
	@Bean
	public String ownerName() {
		System.out.println("ownerName at SecondConfiguration");
		return "Malini";
		}
	@Bean
	public int price() {
		System.out.println("price at SecondConfiguration");
		return 4;
		}
	/**=======================================================*/
	@Bean
	public String name1() {
		return "K12M";
		}
	@Bean
	public String type() {
		return "1200cc";
		}
	@Bean
	public String company() {
		return "Maruti";
		}
	@Bean
	public String strokes() {
		return "4S";
		}
	/**=======================================================*/
	@Bean
	public String name2() {
		System.out.println("-------------------------------");
		return "vinay";

	}
	@Bean
	public String type1() {
		System.out.println("=========================");
		return "vinoda";
	}
	@Bean
	public String poisionous() {
		System.out.println("------------------------");
		return "ghjhg";
	}
	
	
	
	
	
	
}
