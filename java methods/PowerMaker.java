class PowerMaker{
	public static void main(String[] args)
	{
		System.out.println("running main in the PowerKiller");
		PowerBank powerBank1=new PowerBank();
		System.out.println(powerBank1.brand);
		System.out.println(powerBank1.battery);
		System.out.println(powerBank1.price);
		System.out.println(powerBank1.charging);
		System.out.println(powerBank1.capacity);
		powerBank1.brand="Ambrane";
		powerBank1.battery="Rechargable";
		powerBank1.price=300.00f;
		powerBank1.charging="multiple device";
		powerBank1.capacity="2mAh";
		System.out.println("=======================");
		System.out.println(powerBank1.brand);
		System.out.println(powerBank1.battery);
		System.out.println(powerBank1.price);
		System.out.println(powerBank1.charging);
		System.out.println(powerBank1.capacity);
		
		System.out.println("==========poweBank2=============");
		PowerBank powerBank2=new PowerBank();
		System.out.println(powerBank2.brand);
		System.out.println(powerBank2.battery);
		System.out.println(powerBank2.price);
		System.out.println(powerBank2.charging);
		System.out.println(powerBank2.capacity);
		powerBank2.brand="boat";
		powerBank2.battery="Rechargable";
		powerBank2.price=550.00f;
		powerBank2.charging="single device";
		powerBank2.capacity="3mAh";
		System.out.println("=======================");
		System.out.println(powerBank2.brand);
		System.out.println(powerBank2.battery);
		System.out.println(powerBank2.price);
		System.out.println(powerBank2.charging);
		System.out.println(powerBank2.capacity);
	}
}