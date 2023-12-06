package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.PatientRepository;

public class PatientRepositoryImpl implements PatientRepository {
	private String[] nam = new String[TOTAL_ITEMS];
	private int position;
	@Override
	public void care(String names) {
		// TODO Auto-generated method stub
		if(position < TOTAL_ITEMS) {
			this.nam[position]=names;
			System.out.println("stored "+names +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("storage is full");
		}
		
	}
}


