package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.MedicineRepository;
import com.xworkz.Repository.app.impl.MedicineRepositoryImpl;

public class MedicineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedicineRepository ref = new MedicineRepositoryImpl();
		ref.cure("paracetomal");
		ref.cure("cymbalta");
		ref.cure("lisinopril");
		ref.cure("tramadol");
		ref.cure("trazodone");
		ref.cure("ativan");
		ref.cure("gabapentin");
		ref.cure("metformin");
		ref.cure("omeprazole");
		ref.cure("diazepam");
		
	}

}
