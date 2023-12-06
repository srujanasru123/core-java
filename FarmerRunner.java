package com.village.farmer.app.boot;

import com.village.farmer.app.Farmer;

public class FarmerRunner {

	public static void main(String[] args) {
		String name="Srujana";
		Farmer farmer= new Farmer(name);
		Land land= new Land();
		farmer.setLand(land);
		farmer.farming();

		

	}

}
