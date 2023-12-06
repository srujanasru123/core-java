package com.xworkz.crackers;

import com.xworkz.crackers.constants.CrackerType;
import com.xworkz.crackers.dto.CrackerDTO;

public class CrackerRunner {

	public static void main(String[] args) {
	CrackerDTO crackerdto = new CrackerDTO(CrackerType.ATOM_BOMB);
	crackerdto.setName("Lakshmi");
	crackerdto.setPrice(300);
	System.out.println("CrackerDTO");
	
	
	

	}

}
