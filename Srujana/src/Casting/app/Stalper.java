package Casting.app;

public class Stalper {
	public String brand;
	public double price;

	public void pin() {
		System.out.println("invoking pin of no-arg..");
		pin("Cisco");
		pin(228);
	}

	public void pin(String brand) {
		System.out.println("invoking stalper of String..");
		System.out.println("Brand :" + brand);
	}

	public void pin(double price) {
		System.out.println("invoking stalper of double..");
		System.out.println("Price :" + price);
	}

	public void pin(String brand, double price) {
		System.out.println("invoking stalper of String and double..");
		pin(brand);
		pin(price);
	}
}
