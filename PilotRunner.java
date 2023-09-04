package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.PilotRepository;
import com.xworkz.Repository.app.impl.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilotRepository ref = new  PilotRepositoryImpl();
		 ref.fly("wilbur");
		 ref.fly("orville");
		 ref.fly("chuck");
		 ref.fly("charles");
		 ref.fly("albert");
		 ref.fly("jimmy");
		 ref.fly("jean");
		 ref.fly("chesely");
		 ref.fly("louis");
		 ref.fly("noel");
	}

}
