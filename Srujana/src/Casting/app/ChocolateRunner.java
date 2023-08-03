package Casting.app;

public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Invoking main in  ChocolateRunner ");
		
		Chocolate chocolate=new Chocolate();
		DarkChocolate darkChocolate=new DarkChocolate();
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		
		ChocolateUtil.run(caramelChocolate);
		ChocolateUtil.run(darkChocolate);

	}

}
