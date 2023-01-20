package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.service.SoldierService;
import com.xworkz.soldier.service.SoldierServicelmpl;

public class SoldierTester {
	//spring template
	public static void main(String[] args) {
		
		SoldierDTO dto=new SoldierDTO("Ram",4,"Topper","Xworkz","india");
		
		SoldierService service=new SoldierServicelmpl();
		service.validateAndSave(dto);
		
	}
}
