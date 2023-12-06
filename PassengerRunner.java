package com.village.farmer.app.boot;

public class PassengerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in PassengerRunner");
		int age = 25;
		Bus bus = new Bus();
		Passanger pass = new Passanger(age);
		pass.setPassenger(bus);
		pass.travelling();
	}

}
