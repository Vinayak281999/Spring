package com.xwokz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name2;//const
	@Autowired
	@Qualifier("length")
	@Value("10m")
	private String length;//property
	@Autowired
	@Qualifier("color")
	@Value("Black")
	private String color;//property
	private String type1;//const
	private String poisionous;//const

	public Snake() {
		// TODO Auto-generated constructor stub
	}

	public Snake(@Qualifier("")String name2,@Qualifier("") String type1,@Qualifier("") String poisionous) {
		super();
		this.name2 = name2;
		this.type1 = type1;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name2=" + name2 + ", length=" + length + ", color=" + color + ", type1=" + type1
				+ ", poisionous=" + poisionous + "]";
	}


}
