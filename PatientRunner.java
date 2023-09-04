package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.PatientRepository;
import com.xworkz.Repository.app.impl.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientRepository ref = new PatientRepositoryImpl();
		ref.sleep("ullas");
		ref.sleep("srujana");
		ref.sleep("sanjuma");
		ref.sleep("spoo");
		ref.sleep("shobha");
		ref.sleep("raju");
		ref.sleep("arpitha");
		ref.sleep("sru");
		ref.sleep("putta");
		ref.sleep("putti");
	}

}
