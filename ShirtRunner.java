package com.village.farmer.app.boot;

import com.village.farmer.app.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in ShirtRunner");
		String colour="Blue";
		Button button=new Button();
		Shirt shirt=new Shirt(colour);
		shirt.setShirt(button);
		shirt.wearing();
	}

	}


