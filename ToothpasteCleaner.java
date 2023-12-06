package Xworkz.Association;
import Xworkz.Association.Company;
import Xworkz.Association.Ingredents;
import Xworkz.Association.Toothpaste;



public class ToothpasteCleaner {

	public static void main(String[] args) {
System.out.println("Running main in ToothpasteRunner");
		
		String name="Pepsodent";
		String brand="Colgate";
		Company company=new Company("Believer","Arjun","India");
		 Ingredents ingredients = new Ingredents("Garlic", 9.7f, 80);
		 Ingredents ingredients1 = new Ingredents("Clone", 8.8f, 40);
		 Ingredents ingredients2 = new Ingredents("Water", 5.4f, 20);
		 Ingredents ingredients3 = new Ingredents("Sugar", 4.6f, 30); 
		 Ingredents ingredients4 = new Ingredents("Salt", 1.3f, 20);
		 Ingredents[] ingredents= {ingredients,ingredients1,ingredients2,ingredients3,ingredients4};
	     

	        Toothpaste toothpaste = new Toothpaste(name, brand, company, ingredents);
	        toothpaste.printInfo();
	    
		

	}

		

	

}
