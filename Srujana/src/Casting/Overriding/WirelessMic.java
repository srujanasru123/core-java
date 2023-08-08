package Casting.Overriding;

public class WirelessMic extends Mic {
	@Override
	public void makeSound() {
		System.out.println("Invoking no arg constructor in DynamicMic");
	}
}
