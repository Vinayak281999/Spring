package com.xworkz.springValidation.service;

import com.xworkz.springValidation.dto.FirstAidDTO;

public interface FirstAidService {
	
	boolean validateAndSave(FirstAidDTO aidDTO);
}
