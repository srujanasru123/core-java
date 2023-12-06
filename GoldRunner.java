package Casting.app;

public class GoldRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in GoldRunner");
		Gold gold=new Gold("Raj",56700.55,"Kuvempunagar",10.55);
		System.out.println(gold.shopName);
		System.out.println(gold.price);
		System.out.println(gold.location);
		System.out.println(gold.weight);
		
		System.out.println("-----------------------------");
		GoldSmith goldsmith=new GoldSmith();
		System.out.println(goldsmith.shopName);
		System.out.println(goldsmith.price);
		System.out.println(goldsmith.location);
		System.out.println(goldsmith.weight);
		
		System.out.println("-----------------------------");
		GoldSmith goldsmith1=new GoldSmith("Lakshmi",40500.55,"Majestic",15.5);
		System.out.println(goldsmith1.shopName);
		System.out.println(goldsmith1.price);
		System.out.println(goldsmith1.location);
		System.out.println(goldsmith1.weight);

	}

	}


