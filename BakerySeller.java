package Overloading.Overriding.com;

public class BakerySeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("invoking main in BackeryKiller");
		
		Bakery bakery = new Bakery();
		bakery.sell();
		bakery.sell("sweet");
		bakery.sell(1234.0d);
		bakery.sell(26);
		bakery.sell("sweet",1234.0d);
		bakery.sell("sweet",26,1234.0d);
		
		System.out.println("-----------------------------");
		
		Bakery bakery1 = new BakeryShop();
		bakery1.sell();
		bakery1.sell("cake");
		bakery1.sell(3434.0d);
		bakery1.sell(50);
		bakery1.sell("cake",3434.0d);
		bakery1.sell("cake",50,3434.0d);
		
	System.out.println("-----------------------------");
		
		Bakery bakery2= new BakeryShop();
		bakery2.sell();
		bakery2.sell("biscuits");
		bakery2.sell(2344.0d);
		bakery2.sell(14);
		bakery2.sell("biscuits",2344.0d);
		bakery2.sell("biscuits",14,2344.0d);
	}
	}


