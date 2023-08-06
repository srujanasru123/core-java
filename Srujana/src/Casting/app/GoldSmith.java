package Casting.app;

public class GoldSmith extends Gold {
	public GoldSmith()
	{
		this("Raj",56700.55,"Kuvempunagar",13.85);
		System.out.println("Invoking no-arg in GoldSmith");
	}
	public GoldSmith(String shopName,double price,String location,double weight)
	{
		super(shopName,price,location,weight);
		System.out.println("Invoking String and double in GoldSmith");
	}
}
