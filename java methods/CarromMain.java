class CarromMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in CarromMain");
		Carrom carrom=new Carrom();
		System.out.println(carrom.price);
	    System.out.println(carrom.name);
		System.out.println(carrom.noOfPlayer);
		System.out.println(carrom.material);
		System.out.println(carrom.coinColor);
		System.out.println("++++++++++++++++++++");
		Carrom carrom1=new Carrom(1500);
		System.out.println(carrom1.price);
		System.out.println("++++++++++++++++++++");
		Carrom carrom2=new Carrom(1000,"MAGIC GOLD Games");
		System.out.println(carrom2.price);
	    System.out.println(carrom2.name);
		System.out.println("++++++++++++++++++++");
		Carrom carrom3=new Carrom(900,"MAGIC GOLD Games",2);
		System.out.println(carrom3.price);
	    System.out.println(carrom3.name);
		System.out.println(carrom3.noOfPlayer);
		System.out.println("++++++++++++++++++++");
		Carrom carrom4=new Carrom(900,"MAGIC GOLD Games",4,"Premium plywood");
		System.out.println(carrom4.price);
	    System.out.println(carrom4.name);
		System.out.println(carrom4.noOfPlayer);
		System.out.println(carrom4.material);
		System.out.println("++++++++++++++++++++");
		Carrom carrom5=new Carrom(900,"MAGIC GOLD Games",4,"Premium plywood","Black");
		System.out.println(carrom5.price);
	    System.out.println(carrom5.name);
		System.out.println(carrom5.noOfPlayer);
		System.out.println(carrom5.material);
		System.out.println(carrom5.coinColor);
	}
}