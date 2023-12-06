package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.GroceryRepository;

public class GroceryRepositoryImpl implements GroceryRepository {
       private String[] gro=new String[TOTAL_ITEMS];
       private int position;
	@Override
	public void save(String grocery) {
		System.out.println("invoking string items");
		if(position<TOTAL_ITEMS) {
			this.gro[position]=grocery;
			System.out.println("stored" + grocery + "is in the position");
			this.position++;
		}
		else
		{
			System.out.println("storage is full");
		}
		
	}
	
	
}
