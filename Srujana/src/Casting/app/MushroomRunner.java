package Casting.app;

public class MushroomRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in MushroomRunner");
		Mushroom mushroom = new Mushroom("Black",789, 250, false);
		System.out.println(mushroom.color);
		System.out.println(mushroom.price);
		System.out.println(mushroom.quantity);
		System.out.println(mushroom.edible);

		System.out.println("-----------------------");
		PoisonMushroom poisonmushroom = new PoisonMushroom();
		System.out.println(poisonmushroom.color);
		System.out.println(poisonmushroom.price);
		System.out.println(poisonmushroom.quantity);
		System.out.println(poisonmushroom.edible);

		System.out.println("-----------------------");
		PoisonMushroom poisonmushroom1 = new PoisonMushroom("Cream", 60, 620, false);
		System.out.println(poisonmushroom1.color);
		System.out.println(poisonmushroom1.price);
		System.out.println(poisonmushroom1.quantity);
		System.out.println(poisonmushroom1.edible);
	}


	}


