package Casting.Overriding;

public class GoldBangle extends Bangle {
	@Override
	public void sound() {
		System.out.println("Invoking no arg constructor in GoldBangle");
	}
}
