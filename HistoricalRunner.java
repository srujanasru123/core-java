package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.HistoricalRepository;
import com.xworkz.Repository.app.impl.HistoricalRepositoryImpl;

public class HistoricalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HistoricalRepository ref = new  HistoricalRepositoryImpl();
		ref.view("darmastala");
		ref.view("tirupathi");
		ref.view("gajnur");
		ref.view("brp");
		ref.view("beach");
		ref.view("mysorepalace");
		ref.view("amruthapura");
		ref.view("chikmangular");
		ref.view("hampi");
		ref.view("agra");
	}

}
