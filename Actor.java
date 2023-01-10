package com.xworkz.springs.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	private String name;
	private String language;
	private int age;
	
	public Actor(@Value("Shankar Nag")String name,@Value("kannada")String language,@Value("35")int age) {
		this.name=name;
		this.language=language;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public String getLanguage() {
		return language;
	}
	public int getAge() {
		return age;
	}

}
