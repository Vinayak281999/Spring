package com.xworkz.soldier.repositories;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepolmpl implements SoldierRepo {
	
	//System.out.println("Creating SoldierRepolmpl using no-arg const");

	@Override
	public boolean save(SoldierDTO dto) {
		// TODO Auto-generated method stub
		
		System.out.println("Running save");
		System.out.println("DTO"+dto);
		return false;
	}

}
