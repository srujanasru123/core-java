package com.village.farmer.app.boot;

public class MobileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in Mobilerunner");
		String name="IPhone";
		Charger charger=new Charger();
		Mobile mobile =new Mobile(name);
		mobile.setMobile(charger);
		mobile.msg();
		mobile.music();
		mobile.typing();
		mobile.call()
	}

}
