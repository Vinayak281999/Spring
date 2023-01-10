package com.xworkz.springs.bean;

import org.springframework.beans.factory.annotation.Value;

public class Season {
	
	private String name;
	private String duration;
	private String startingMonth;
	
	public Season() {
		System.out.println("Season created with Spring");
	}

	public String getName() {
		return name;
	}
	@Value("Summer")
	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}
	@Value("3 months")
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}
	@Value("march")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	

}
