package Xworkz;

public class Store {
	Salesman salesman=new Salesman();
	public void store() {
		System.out.println("invoking information about Store");
		this.salesman.product();
		this.salesman.travel();
	}

}
