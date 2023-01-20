package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;



import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repositories.SoldierRepo;

public class SoldierServicelmpl implements SoldierService {
	
	private SoldierRepo soldierRepo;
	
	 public SoldierServicelmpl() {
		// TODO Auto-generated constructor stub
		System.out.println("Created SoldierServicelmpl useing no-arg const........ ");
	}
	 public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("Starting validateAndSave");
		
		System.out.println("DTO passed dto");
		//Factory
		//valid
		//validate
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> voilation = validator.validate(dto);
		
		if(!voilation.isEmpty()) {
			System.out.println("There is validation error");
			voilation.forEach(v->{System.err.println("Volidator message"+v.getMessage());
				});
			return false;
			
		}else {
			System.out.println("Date is valid.....");
			return true;
		}
				
				
		
	}

}
