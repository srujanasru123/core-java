package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.PilotRepository;

public class PilotRepositoryImpl implements  PilotRepository {
	private String[] nam = new String[TOTAL_ITEMS];
	private int position;
	@Override
	public void fly(String name) {
		// TODO Auto-generated method stub
		if(position < TOTAL_ITEMS) {
			this.nam[position]=name;
			System.out.println("stored "+name +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("pilot has to be a degree ");
	}
}
	
}
