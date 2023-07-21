class Oil{
	String name;
	double viscosity;
	int quantity;
	
	Oil()
	{
		System.out.println("Invoking constructor of Oil");
	}
	
	Oil(String name)
	{
		System.out.println("Invoking String constructor of Oil");
		System.out.println("Passing the name of oil :"+name);
		this.name=name;
	}
		
	Oil(String name,double viscosity)
	{
		System.out.println("Invoking String,double constructor of Oil");
		System.out.println("Passing the name of oil :"+name);
		System.out.println("Passing the viscosity of oil :"+viscosity);
		this.name=name;
		this.viscosity=viscosity;
	}		
	
	Oil(String name,double viscosity,int quantity)
	{
		System.out.println("Invoking String,double,int constructor of Oil");
		System.out.println("Passing the name of oil :"+name);
		System.out.println("Passing the viscosity of oil :"+viscosity);
		System.out.println("Passing the quantity of oil :"+quantity);
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
}