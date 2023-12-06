package Xworkz.Association;

public class Player {
	public String name;
	public int exp;
	public Buildings buildings;
	public HomeTown town;

	public Player(String name, int exp, Buildings buildings, HomeTown town) {
		this.name = name;
		this.exp = exp;
		this.buildings = buildings;
		this.town = town;

	}

	public void printInfo() {
		System.out.println("//////////////////////////////////////////////");
		System.out.println("Invoking printInfo in Player");
		System.out.println("Player Name is:" + name);
		System.out.println("Experience:" + exp);
		
		town.printInfo();
		buildings.printInfo();

	}

}


