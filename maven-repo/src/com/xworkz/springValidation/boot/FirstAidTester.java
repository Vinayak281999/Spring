package com.xworkz.springValidation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springValidation.configuration.SpringConfiguration;
import com.xworkz.springValidation.dto.FirstAidDTO;
import com.xworkz.springValidation.service.FirstAidService;

public class FirstAidTester {
public static void main(String[] args) {
	
	ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	FirstAidService service = container.getBean(FirstAidService.class);
	boolean saved = service.validateAndSave(new FirstAidDTO());
}
}
