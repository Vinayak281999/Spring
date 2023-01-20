package com.xworkz.springValidation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springValidation.configuration.SpringConfiguration;
import com.xworkz.springValidation.dto.ResortDTO;
import com.xworkz.springValidation.service.ResortService;

public class ResortTester {
public static void main(String[] args) {
	
	ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	ResortService service = container.getBean(ResortService.class);
	boolean saved = service.validateAndSave(new ResortDTO());
}
}
