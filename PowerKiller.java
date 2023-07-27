class PowerKiller{
	public static void main(String[] args){
		System.out.println("Running main in PowerKiller");
		
		Power power=new Power("AC",220);
		Power.staticPower();
		power.instancePower();
		
		System.out.println("##################################");
		
		Power power1=new Power("AC",240);
		Power.staticPower();
		power1.instancePower();
		
	}
}