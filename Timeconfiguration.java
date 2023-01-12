package com.xworkz.autowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class Timeconfiguration {

	@Bean
	public Integer id()
	{
		System.out.println("id is registered with spring");
		Integer id=new Integer(12);
		return id;

	}

	@Bean
	public String name()
	{
		System.out.println("name registering with spring");
		String str=new String("Ram hardware shop");
		return str;
	}

	@Bean 
	public String no()
	{
		System.out.println("gstNo registering with spring");
		return "637gfh3565";

	}

	@Bean
	public String owerName()
	{
		System.out.println("owername registering with spring");
		String str=new String("Ram");
		return str;
	}

	@Bean
	public String address()
	{
		System.out.println("shop address is registering with spring");
		String str=new String("RamaNagar");
		return str;
	}
	@Bean 
	public String engineerName()
	{
		System.out.println("engineer name registered with spring");
		return "vinayak";
	}

	@Bean
	public double salary()
	{
		System.out.println("salary is registerd with spring");
		return 50000;
	}

	@Bean
	public String companyName()
	{
		System.out.println("companyname is registered with spring");
		return "IBM";
	}

	@Bean
	public Integer experiance()
	{
		System.out.println("experiance registered with spring");
		return 6;
	}
	@Bean
	public String appName()
	{
		System.out.println("software name is registering with spring");
		return "Visual studio";
	}

	@Bean 
	public double version()
	{
		System.out.println("version is registered with spring");
		return 5;
	}

	@Bean
	public String developer()
	{
		System.out.println("developer is registered with spring");
		return "Microsoft";
	}

	@Bean 
	public double data()
	{
		System.out.println("data is registerig with spring");
		return 60.64;
	}

	@Bean 
	public boolean free()
	{
		System.out.println("free is registering with spring");
		return true;
	}
	@Bean 
	public String pencilName()
	{
		System.out.println("pencil name is registered with spring");
		return "Nataraj";
	}

	@Bean
	public String type()
	{
		System.out.println("type is registered with spring");
		return "wood";

	}

	@Bean
	public Integer price()
	{
		System.out.println("price is registered with spring");
		return 10;

	}

	@Bean
	public String color()
	{
		System.out.println("color is registered with spring");
		return "Red";
	}

	@Bean
	public boolean sharp()
	{
		System.out.println("sharp is registered with spring");
		return true;

	}

	@Bean
	public boolean stolen()
	{
		System.out.println("stolean is registered with spring");
		return false;
	}
	@Bean 
	public String rubberName()
	{
		System.out.println("rubber name is registered with spring");
		return "apsara";
	}

	@Bean
	public String type1()
	{
		System.out.println("type is registered with spring");
		return "rubber";

	}

	@Bean
	public Integer price1()
	{
		System.out.println("price is registered with spring");
		return 10;

	}

	@Bean
	public String color1()
	{
		System.out.println("color is registered with spring");
		return "white";
	}

	@Bean
	public boolean sharp1()
	{
		System.out.println("sharp is registered with spring");
		return true;

	}

	@Bean
	public boolean stolen1()
	{
		System.out.println("stolean is registered with spring");
		return false;
	}

	@Bean
	public Integer size()
	{
		System.out.println("size is registered with spring");
		return 2;
	}
	
}
