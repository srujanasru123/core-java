package com.village.farmer.app.boot;

public class PantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in PantRunner");
		int size=28;
		Zip zip=new Zip();
		Pant pan=new Pant(size);
		pan.setPant(zip);
		pan.washing();

	}
	}

}
