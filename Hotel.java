package Casting.app;

public class Hotel {
	public String name;
	public double type;
	
	public void fivestar()
	{
		System.out.println("invoking fivestar of no-arg..");
		fivestar("Raj");
		fivestar(true);
	}
	
	public void fivestar(String name) {
		System.out.println("invoking sevenstar of String...");
		System.out.println("Hotel Name :"+name);
	}
	
	public void fivestar(boolean type)
	{
		System.out.println("invoking fivestar of boolean...");
		System.out.println("NonPure Veg :"+type);
	}
	
	public void fivestar(String name,boolean type)
	{
		fivestar(name);
		fivestar(type);
	}
}
