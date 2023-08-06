package Casting.app;

	public class CricketGround extends Ground{
		public CricketGround()
		{
			this("ChinnaSwamy","137m",11,"Rajajinagar");
			System.out.println("Invoking no-arg in CricketGround");
		}
		public CricketGround(String name,String dimension,int noOfPlayer,String location)
		{
			super(name,dimension,noOfPlayer,location);
			System.out.println("Invoking String,int in CricketGround");
		}
	}


