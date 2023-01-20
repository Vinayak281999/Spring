package com.xworkz.springValidation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springValidation.configuration.SpringConfiguration;
import com.xworkz.springValidation.dto.MissileDTO;
import com.xworkz.springValidation.service.MissileService;

public class MissileTester {
 public static void main(String[] args) {
	
	 ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	 MissileService service = container.getBean(MissileService.class);
	 boolean saved = service.validateAndSave(new MissileDTO());
}
}
