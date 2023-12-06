package Casting.app;

public class Mouse {
	public String brand;
	public int resolution;
	
	public void point()
	{
		System.out.println("invoking point of no-arg..");
		point("Lenovo");
		point(1500);
	}
	
	public void point(String brand)
	{
		System.out.println("invoking Mouse of String...");
		System.out.println("Brand : "+brand);
	}
	
	public void point(int resolution)
	{
		System.out.println("invoking Resolution of int..");
		System.out.println("Resolution : "+resolution );
	}
	
	public void point(String brand,int resolution)
	{
		point(brand);
		point(resolution);
	}
}
