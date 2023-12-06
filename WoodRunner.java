package com.village.farmer.app.boot;

import com.village.farmer.app.Wood;

public class WoodRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in WoodRunner");
		double price=5000;
		Paper paper=new Paper();
		Wood wood =new Wood(price);
		wood.setWood(paper);
		wood.polish();
	}
	}


