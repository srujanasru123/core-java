package com.village.farmer.app.boot;

public class LaptopsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in LaptopsRunner");
		String brand="HP";
		Processor pro=new Processor();
		Processor lap=new Processor(brand);
		lap.setLaptops(pro);
		lap.game();
		lap.movie();
		lap.program();
		lap.chatting();

	}

	}


