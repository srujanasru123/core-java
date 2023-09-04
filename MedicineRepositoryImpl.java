package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.MedicineRepository;

public class MedicineRepositoryImpl implements MedicineRepository {
	private String[] nam = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void cure(String name) {
		// TODO Auto-generated method stub
		if(position < TOTAL_ITEMS) {
			this.nam[position]=name;
			System.out.println("stored "+name +"is in the position"+this.position);
			this.position++;
		}
		else 
		{
			System.err.println("storage is full");
		}
	}

}
