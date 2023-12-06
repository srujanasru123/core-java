package com.xworkz.app.repositoryimpl;

import com.xworkz.app.dto1.EngineerDTO;
import com.xworkz.app.repository.EngineerDTORepository;

public class EngineerDTORepositoryImpl implements EngineerDTORepository {
	private EngineerDTO[] dtos= new EngineerDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(EngineerDTO dto) {
		System.out.println(" invoking main in EngineeringImpl");
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=dto;
			System.out.println("stored"+dto+" is in position"+this.position);
			this.position++;
		}
		else {
			System.out.println("storage is full ............cannot save");
		}
		

	}

}
