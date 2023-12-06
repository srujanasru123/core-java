package Xworkz.Association;

public class Corporator {
	public Buildings[] buildings;
	public String name;

	public Corporator(String name, Buildings[] buildings) {
		this.name = name;
		this.buildings = buildings;
	}

	public void printInfo() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("Invoking printInfo in Corporator");
		System.out.println("Corporator Name is:" + name);
		for (int i = 0; i < this.buildings.length; i++) {
			Buildings ref = buildings[i];
			ref.printInfo();

		}
	}


}
