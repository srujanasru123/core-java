package com.xworkz.sru.boot;

public class Array {

	public static void main(String[] args) {
		System.out.println("Running main in CitiesArray");
		{
		String shimoga  = "Shimoga";
		String chikmangluru = "Chikmangluru";
		String bangalore = "Bangalore";
		String tumkuru = "Tumkuru";
		String udupi = "Udupi";
		String mysuru = "Mysuru";
		String hassan = "Hassan";
		
		
		String[] names ={shimoga,chikmangluru,bangalore,tumkuru,udupi,mysuru,hassan};
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		{
			String[] arrayList;
			int array;
			String ref=arrayList[array];
			System.out.println("Grocery at "+ref+" is "+array);
		}
		
		String ref1 = names[1];
		
		System.out.println("cities in karnataka index 1 :"+ref1);
		
		String ref2 = names[2];
		
		System.out.println("cities in karnataka index 2 :"+ref2);
		
		String ref3 = names[3];
		
		System.out.println("cities in karnataka index 3  :"+ref3);
		
		String ref4 = names[4];
		
		System.out.println("cities in karnataka index 4  :"+ref4);
		
        String ref5 = names[5];
		
		System.out.println("cities in karnataka index 5 :"+ref5);
		
		 String ref6 = names[6];
			
		System.out.println("cities in karnataka index 5 :"+ref6);
		
		 String ref7 = names[7];
			
		System.out.println("cities in karnataka index 5 :"+ref7);
		
		}
	}
}


