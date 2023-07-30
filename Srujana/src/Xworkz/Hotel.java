package Xworkz;

public class Hotel {
	Cook cook=new Cook();
	public void hotel() {
		System.out.println("invoking information about Hotel");
		this.cook.cooking();
		this.cook.salary();
	}
}
