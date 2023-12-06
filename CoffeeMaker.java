package Casting.app;

public class CoffeeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in CoffeeRunner");
		Coffee coffee=new Coffee("Cold Coffee",60,"Continental",true);
		System.out.println(coffee.name);
		System.out.println(coffee.price);
		System.out.println(coffee.brand);
		System.out.println(coffee.tasty);
		
		System.out.println("------------------------");
		ColdCoffee coldcoffee=new ColdCoffee();
		System.out.println(coldcoffee.name);
		System.out.println(coldcoffee.price);
		System.out.println(coldcoffee.brand);
		System.out.println(coldcoffee.tasty);
		
		System.out.println("------------------------");
		ColdCoffee coldcoffee1=new ColdCoffee("Cold Coffee",80,"Tata Coffee",true);
		System.out.println(coldcoffee1.name);
		System.out.println(coldcoffee1.price);
		System.out.println(coldcoffee1.brand);
		System.out.println(coldcoffee1.tasty);
				

	}
	}


