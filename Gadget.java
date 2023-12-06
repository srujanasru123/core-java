package Casting.app;

public class Gadget {
	public String type;
	public double price;
	
	
	public void item()
	{
		System.out.println("invoking item of no-arg..");
		item("Oven");
		item(15000);
	}
	
	public void item(String type)
	{
		System.out.println("invoking gadget of String..");
		System.out.println("Type :"+type);
	}
	
	public void item(double price)
	{
		System.out.println("invoking gadget of double...");
		System.out.println("Price :"+price);
	}
	
	public void item(String type,double price)
	{
		item(type);
		item(price);
	}
	
}
