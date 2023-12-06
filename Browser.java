package Xworkz;

public class Browser {
	Internet internet=new Internet();
	public void browser() {
		System.out.println("invoking information from Browser");
		this.internet.connect();
		this.internet.service();
	}

}


