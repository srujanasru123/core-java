package Casting.Overriding;

public class SlidingGate extends Gate {
	@Override
	public void close() {
		System.out.println("Invoking no arg constructor in SlidingGate");
	}
}
