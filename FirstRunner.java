package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.HardwareShop;
import com.xworkz.autowired.bean.Pencil;
import com.xworkz.autowired.bean.Rubber;
import com.xworkz.autowired.bean.Software;
import com.xworkz.autowired.bean.SoftwareEngineer;
import com.xworkz.autowired.configuration.Timeconfiguration;

public class FirstRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext spring =new AnnotationConfigApplicationContext(Timeconfiguration.class);
		
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		HardwareShop shop=spring.getBean(HardwareShop.class);
		System.out.println(shop);
		
		System.out.println(shop.getName());
		System.out.println(shop.getId());
		System.out.println(shop.getAddress());
		System.out.println(shop.getGstNo());
		System.out.println(shop.getOwnerName());
       
		SoftwareEngineer engineer=spring.getBean(SoftwareEngineer.class);
		System.out.println(engineer);
		
		System.out.println(engineer.getName());
		System.out.println(engineer.getSalary());
		System.out.println(engineer.getCompanyName());
		System.out.println(engineer.getExperiance());
		
		Software soft=spring.getBean(Software.class);
		System.out.println(soft);
		System.out.println(soft.getName());
		System.out.println(soft.getData());
		System.out.println(soft.getDeveloper());
		System.out.println(soft.getVersion());
		System.out.println(soft.isFree());
		
		Pencil p=spring.getBean(Pencil.class);
		System.out.println(p);
		System.out.println(p.getName());
		System.out.println(p.getColor());
		System.out.println(p.getPrice());
		System.out.println(p.getType());
		System.out.println(p.isSharp());
		System.out.println(p.isStolen());
		
		Rubber r=spring.getBean(Rubber.class);
		System.out.println(r);
		System.out.println(r.getName());
		System.out.println(r.getPrice());
		System.out.println(r.getColor());
		System.out.println(r.getType());
		System.out.println(r.getSize());
		System.out.println(r.isSharp());
		System.out.println(r.isStolen());


	}

}
