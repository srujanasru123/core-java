package com.xworkz.map.boot;

import java.util.Set;

public class CompanyRunner {

	public static void main(String[] args) {
	CompanyDTO companydto = new CompanyDTO("Sunflower","Shimoga",20);
	CompanyDTO companydto2 = new CompanyDTO("Goldwinner","bangalore",25);
	CompanyDTO companydto3 = new CompanyDTO("Winner","bhadravathi",28);
	
	
	
	
	Set<String>nameSet=CompanyDTO.keySet();
	nameSet.forEach(a->System.out.println(a));
	
	

	}

}
