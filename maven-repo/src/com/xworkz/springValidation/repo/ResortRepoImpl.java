package com.xworkz.springValidation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.ResortDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class ResortRepoImpl implements ResortRepo {
	
	@Override
	public boolean save(ResortDTO rstdto) {
		System.out.println("running save in repo ");
		System.out.println("rstDTO : " + rstdto);
		return true;
	}

}
