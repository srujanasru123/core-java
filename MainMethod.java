package Casting.app;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************ Inron Box Info***********");
		IronBox box=new IronBox();
		box.iron();
		System.out.println("\n");
		box.iron("Preethi",1500);

		System.out.println("*******Hotel info**********");

		Hotel star=new Hotel();
		star.fivestar();
		System.out.println("\n");
		star.fivestar("Raj",true);
		
		
		System.out.println("**********Stalper info****************");
		
		Stalper store=new Stalper();
		store.pin();
		System.out.println("\n");
		store.pin("Cicso",800);
		
		System.out.println("***********Umbrella info**************");
		
		Umbrella drop=new Umbrella();
		drop.rain();
		System.out.println("\n");
		drop.rain("Blue",160);

		System.out.println("****************GADGET info **********");
		
		Gadget product=new Gadget();
		product.item();
		System.out.println("\n");
		product.item("Oven",15000);
		
		System.out.println("**********Piler info***********");
		
		Piler kit=new Piler();
		kit.tool();
		System.out.println("\n");
		kit.tool("TMT",'L');
		
		System.out.println("*********** Mouse info************** ");		
		Mouse key=new Mouse();
		key.point();
		System.out.println("\n");
		key.point("Lenovo",1500);
		
		System.out.println("**************Elevator info ***********************-");
		
		Elevator run=new Elevator();
		run.lift();
		System.out.println("\n");
		run.lift("System",800);
	}

	}


