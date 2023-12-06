package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.HistoricalRepository;

public class HistoricalRepositoryImpl implements  HistoricalRepository {
	private String[] pal = new String[TOTAL_ITEMS];
	private int position;
	@Override
	public void view(String placename) {
		// TODO Auto-generated method stub
		
			this.pal[position]=placename;
			System.out.println("stored "+placename +"is in the position"+this.position);
			this.position++;
		
			
		}

	

	}


