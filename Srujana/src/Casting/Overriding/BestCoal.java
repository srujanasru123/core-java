package Casting.Overriding;

public class BestCoal extends Coal {
	@Override
	public void burn() {
		System.out.println("Invoking no arg constructor in BestCoal");
	}
	
}
