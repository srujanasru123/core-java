package Casting.Overriding;

public class CoalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Running main in CoalRunner");
		
		Coal coal=new BestCoal();
		coal.burn();
	}

}
