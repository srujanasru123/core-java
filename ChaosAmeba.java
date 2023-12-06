package Casting.Overriding;

public class ChaosAmeba extends Ameba {
	@Override
	public void move() {
		System.out.println("Invoking no arg constructor in ChaosAmeba");
	}
}
