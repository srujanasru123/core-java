package com.Abstract.app;

public class DifferentBirds extends Birds{


		@Override
	    public String getName() {
	        return "Pegion";
	    }

	    @Override
	    public int getAge() {
	        return 4;
	    }

	    @Override
	    public void roam() {
	        System.out.println("Birds are roaming around.");
	    }

	    @Override
	    public void reproduce() {
	        System.out.println("Birds reproducing.");
	    }

	    @Override
	    public void habitat() {
	        System.out.println("Birds lives in the forest.");
	    }
}
