package Casting.Overriding;

public class VelociraptorDinosaur extends Dinosaur {
	@Override
	public void eat() {
		System.out.println("Invoking no arg constructor in VelociraptorDinosaur ");
	}
}
