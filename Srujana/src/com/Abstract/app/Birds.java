package com.Abstract.app;

public  abstract class Birds {

		public void eat() {
	        System.out.println("Birds are eating.");
	    }

	    public void sleep() {
	        System.out.println("Birds are sleeping.");
	    }

	    public void move() {
	        System.out.println("Birds are moving.");
	    }

	    public void makeSound() {
	        System.out.println("Birds makes a sound.");
	    }

	    public void breathe() {
	        System.out.println("Birds breaths");
	    }

	    public abstract String getName();
	    public abstract int getAge();
	    public abstract void roam();
	    public abstract void reproduce();
	    public abstract void habitat();
}

