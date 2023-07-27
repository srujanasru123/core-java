class Power{
	static String unit;
	static String qunatityType;
	String powerSupply;
	int voltage;
	
	Power(String powerSupply,int voltage){
		System.out.println("Invoking String,int constructor in Power");
		this.powerSupply=powerSupply;
		this.voltage=voltage;
	}
	
	static{
		unit="Watt";
		qunatityType="Scalar";	
	}
	
	static void staticPower(){
		System.out.println("static variables in Power");
		System.out.println("Power unit is:"+unit);
		System.out.println("Quantity type is:"+qunatityType);

	}
	void instancePower(){
		System.out.println("instance variables in Power");
	    System.out.println("powerSupply is:"+powerSupply);
		System.out.println("Voltage In Weeks is:"+voltage);


	}
}