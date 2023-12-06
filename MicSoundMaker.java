package Casting.Overriding;

public class MicSoundMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Running main in MicRunner");
		
		Mic mic=new WirelessMic();
		mic.makeSound();
	}

}
