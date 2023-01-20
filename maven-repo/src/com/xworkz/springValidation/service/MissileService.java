package com.xworkz.springValidation.service;

import com.xworkz.springValidation.dto.MissileDTO;

public interface MissileService {
	
	boolean validateAndSave(MissileDTO msldto);
}
