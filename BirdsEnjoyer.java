package com.Abstract.app;

public class BirdsEnjoyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in AnimalRunner ");

		Birds birds = new DifferentBirds();

		birds.eat();
		birds.move();
		birds.makeSound();
		birds.sleep();
		birds.breathe();


		System.out.println("Birds name:"+birds.getName());
		
		birds.roam();
		birds.reproduce();
		birds.habitat();

	}

}
