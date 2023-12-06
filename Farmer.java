package com.village.farmer.app;

import com.village.farmer.app.boot.Land;

public class Farmer {
	private String name;
	private Land land;
	
	public Farmer(String name) {
		this.name=name;
		
	}
	
   public void setLand(Land land) {
	   this.land=land;
   }
   
    public void farming() {
    	System.out.println("Farming in agriculture");
    	this.land.cropGrowing();
    }
}
