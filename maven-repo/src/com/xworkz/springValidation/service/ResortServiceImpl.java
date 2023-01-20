package com.xworkz.springValidation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.ResortDTO;
import com.xworkz.springValidation.repo.ResortRepo;
@Component
public class ResortServiceImpl implements ResortService {
	
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
		System.out.println("Created Service by passing repo.... From spring....");
	}
	
	public ResortServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	

	@Override
	public boolean validateAndSave(ResortDTO rstdto) {
		System.out.println("running validate And Save");
		System.out.println("rstDTO : " + rstdto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ResortDTO>> violations = validator.validate(rstdto);
		
		if (!violations.isEmpty()) {
			System.err.println("There are Validation Errors");
			return false;
		} else {
			System.out.println("Data is Valid...... + can Save ");
			boolean saved = this.resortRepo.save(rstdto);
			System.out.println("Saved resort " + saved);
			return saved;

		}
	}

}
