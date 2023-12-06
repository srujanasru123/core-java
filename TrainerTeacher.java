package com.village.farmer.app.boot;

import com.village.farmer.app.Farmer;
import com.village.farmer.app.Trainer;

public class TrainerTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in LaptopRunner");
		String name="Omkar";
		Trainer trainer= new Trainer();
		Laptop laptop= new Laptop();
		trainer.setlaptop(laptop);
	    trainer.exp();


}
}
