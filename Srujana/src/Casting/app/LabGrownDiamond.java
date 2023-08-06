package Casting.app;

public class LabGrownDiamond extends Diamond {
	public LabGrownDiamond()
	{
		this("Maharaj","Vijaynagara",78000.30,20);
		System.out.println("Invoking no-arg in LabGrownDiamonds");
	}
	public LabGrownDiamond(String shopeName,String address,double price,double weight)
	{
		super(shopeName,address,price,weight);
		System.out.println("Invoking String and double in LabGrownDiamonds");
	}
}
