package com.xworkz.Repository.boot;

public class HistoricalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HistoricalRepo ref = new  HistoricalImpl();
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
