package Casting.app;

public class ColdCoffee extends Coffee {
	public ColdCoffee()
	{
		this("Cold Coffee",40,"Country Bean",true);
		System.out.println("Invoking no-arg in ColdCoffee");
	}
	public ColdCoffee(String name,double price,String brand,boolean tasty)
	{
		super(name,price,brand,tasty);
		System.out.println("Invoking String,double and boolean in ColdCoffee");
	}
}
