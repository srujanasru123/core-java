package Casting.Overriding;

public class StudioTheator extends Theator{
	@Override
	public void playMovies() {
		System.out.println("Invoking no arg constructor in StudioTheatre");
	}
}
