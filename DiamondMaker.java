package Casting.app;

public class DiamondMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Invoking main in DiamondRunner");
			Diamond diamond=new Diamond("Maharaj","Vijayanagara",78000.30,20.4);
			System.out.println(diamond.shopeName);
			System.out.println(diamond.address);
			System.out.println(diamond.price);
			System.out.println(diamond.weight);
			
			System.out.println("---------------------------");
			LabGrownDiamond labGrownDiamond=new LabGrownDiamond();
			System.out.println(labGrownDiamond.shopeName);
			System.out.println(labGrownDiamond.address);
			System.out.println(labGrownDiamond.price);
			System.out.println(labGrownDiamond.weight);
			
			System.out.println("---------------------------");
			LabGrownDiamond labGrownDiamond1=new LabGrownDiamond("Sharada","majestic",60789.76,20.5);
			System.out.println(labGrownDiamond1.shopeName);
			System.out.println(labGrownDiamond1.address);
			System.out.println(labGrownDiamond1.price);
			System.out.println(labGrownDiamond1.weight);

		}

	}


