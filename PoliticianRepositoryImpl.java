package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.PoliticianRepository;

public class PoliticianRepositoryImpl implements PoliticianRepository {
	private String[] pol= new String[TOTAL_MEMBERS];
	private int position;
	
	@Override
	public void list (String Names) {
		System.out.println("invoking rule in PoliticianImpl");
		if(position < TOTAL_MEMBERS) {
			this.pol[position]= Politician;
			System.out.println("stored" + Politician +" is in the position ");
			this.position++;
		}
		else
		{
			System.out.println("Politician has power");
			
			
		}
			
		
	}

}
