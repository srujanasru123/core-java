package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {
	private GroceryRepository groceryRepository;

	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		this.groceryRepository=groceryRepository;
	}

	@Override
	public boolean save(String grocery ) {
			System.out.println("invoking validate and save" +this.getClass().getSimpleName());
			if(grocery!=null && !grocery.isEmpty() && grocery.length()>=0 && grocery.length()>=3)
			{
				System.out.println("Grocery data is valid");
				this.groceryRepository.save(grocery);
				return true;
			}
			else
			{
				System.out.println("Grocery data is invalid, cannot save");
			}
			return false;
		}

	
	

	
}
