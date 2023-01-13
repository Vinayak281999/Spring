package com.xwokz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Newspaper {
	@Value("2")
	private int id;//property
	@Autowired
	private String name;//const
	@Autowired
	private String ownerName;//const
	@Value("Kannada")
	private String language;//property
	private int price;//Setter
	
	public Newspaper(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Newspaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ","
			+ " language=" + language
				+ ", price=" + price + "]";
	}

	
	@Autowired
	public void setPrice(int price) {
		this.price = price;
	}
}
