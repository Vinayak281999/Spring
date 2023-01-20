package com.xworkz.springValidation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.FirstAidDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo {
	
	@Override
	public boolean save(FirstAidDTO aidDTO) {
		// TODO Auto-generated method stub
		System.out.println("running save in repo ");
		System.out.println("aidDTO : " + aidDTO);
		return true;
	}

}
