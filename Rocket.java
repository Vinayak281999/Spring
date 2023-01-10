package com.xworkz.springs.bean;

import org.springframework.beans.factory.annotation.Value;

public class Rocket {
	
	@Value("GSLV")
	private String name;
	@Value("India")
	private String Country;
	@Value("47")
	private double budget;
	
	public void Rocket() {
		System.out.println(" Rocket created by spring...");
	}
	
	public String getName() {
		return name;
	}

	

	public String getCountry() {
		return Country;
	}

	

	public double getBudget() {
		return budget;
	}

	

	
	

}
