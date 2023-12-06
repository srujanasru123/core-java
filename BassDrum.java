package Casting.Overriding;

public class BassDrum extends Drum {
	@Override
	public void noise() {
		System.out.println("Invoking no arg constructor in BassDrum");
	}
}
