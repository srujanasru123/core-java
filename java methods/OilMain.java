class OilMain{
	public static void main(String[] cooking)
	{
		System.out.println("Invoking main in OilMain");
		Oil oil=new Oil();
		System.out.println(oil.name);
		System.out.println(oil.viscosity);
		System.out.println(oil.quantity);
		System.out.println("++++++++++++++++++++");
		Oil oil1=new Oil("Sun Flower");
		System.out.println(oil1.name);
		System.out.println("++++++++++++++++++++");
		Oil oil2=new Oil("Coconut",90);
		System.out.println(oil2.name);
		System.out.println(oil2.viscosity);
		System.out.println("++++++++++++++++++++");
		Oil oil3=new Oil("Olive",80,10);
		System.out.println(oil3.name);
		System.out.println(oil3.viscosity);
		System.out.println(oil3.quantity);
	}
}