package Xworkz.Association;
import Xworkz.Association.Area;
import Xworkz.Association.Buildings;
import Xworkz.Association.Corporator;
import Xworkz.Association.Floor;
import Xworkz.Association.HomeTown;
import Xworkz.Association.Lift;
import Xworkz.Association.Player;
import Xworkz.Association.Sports;

public class SportsWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Running main in SportsWinner");
		String name="Cricket";
		
		Floor floor=new Floor("Ground Floor",0);
		Floor floor1=new Floor("First Floor",1);
		Floor floor2=new Floor("Second Floor",2);
		Floor floor3=new Floor("Third Floor",3);
		Floor floor4=new Floor("Four Floor",4);
		Floor floor5=new Floor("Fifth Floor",5);
		Floor floor6=new Floor("Sixth Floor",6);
		
		Floor[] floors= {floor, floor1, floor2, floor3, floor4, floor5, floor6};
		
		Lift lift=new Lift(1);
		Lift lift1=new Lift(2);
		
		Lift[] lifts= {lift, lift1};
		
		Buildings buildings=new Buildings(floors,lifts);
		Buildings buildings1=new Buildings(floors,lifts);
		Buildings[] buildings= {buildings};
		
		
		Corporator corporator=new Corporator("Ram",buildings);
		Area area=new Area("Kuvempu Layout", corporator);
		Area area1=new Area("Majestic", corporator);
		Area[] areas= {area,area1};
		HomeTown town=new HomeTown("Bangalore", 543500, areas );
		
		
		
		Player player=new Player ("Rahul",28,buildings,town);
		Player player1=new Player("Harish",25,buildings,town);
		Player[] players= {player,player1};
		
		Sports sports=new Sports(name,players);
	    sports.printInfo();

	}
	

}
