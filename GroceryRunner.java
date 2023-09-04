package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.GroceryRepository;
import com.xworkz.Repository.app.impl.GroceryRepositoryImpl;

public class GroceryRunner {

	public static void main(String[] args) {
	GroceryRepository repo=new GroceryRepositoryImpl();
	repo.save("sugar");
	repo.save("salt");
	repo.save("onion");
	repo.save("potato");
	repo.save("raddish");
	repo.save("maggie");
	repo.save("rice");
	repo.save("wheat");
	repo.save("tomoto");
	repo.save("chilli");
	repo.save("maida");
	
	

	}

}
