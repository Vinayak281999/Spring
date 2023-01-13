package com.xwokz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Engine {
	private String name1;//const
	private String type;//const
	@Autowired
	@Value("2")
	@Qualifier("number")
	private int number;//property
	@Autowired
	@Qualifier("version")
	@Value("BS6")
	private String version;//property
	private String company;//const
	private String strokes;//setter
	
	@Override
	public String toString() {
		return "Engine [name=" + name1 + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	public Engine(String name1, String type, String company) {
		super();
		this.name1 = name1;
		this.type = type;
		this.company = company;
	}

	/**
	 * @return the strokes
	 */
	public String getStrokes() {
		return strokes;
	}
	@Autowired
	@Qualifier("strokes")

	/**
	 * @param strokes the strokes to set
	 */
	public void setStrokes(String strokes) {
		this.strokes = strokes;
	}
    
	
}
