package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.PatientRepository;
import com.xworkz.Repository.app.impl.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientRepository ref = new PatientRepositoryImpl();
		ref.care("ullas");
		ref.care("srujana");
		ref.care("sanjuma");
		ref.care("spoo");
		ref.care("shobha");
		ref.care("raju");
		ref.care("arpitha");
		ref.care("sru");
		ref.care("putta");
		ref.care("putti");
	}

}
