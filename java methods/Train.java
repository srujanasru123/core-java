public class Train{
	static String getTrainName(int trainNumber){
		System.out.println("Train Number");
		if(trainNumber != 0){
			if(trainNumber == 11013){
				System.out.println("Train number is: " + trainNumber);
				return "RajdhaniExpress";
			}
			if(trainNumber == 11014){
				System.out.println("Train number is: " + trainNumber);
				return "PassengerExpress";
			}
			if(trainNumber == 12134){
				System.out.println("Train number is: " + trainNumber);
				return "MahamanaExpress";
			}
			if(trainNumber == 22691){
				System.out.println("Train number is: " + trainNumber);
				return "HumsafarExpress";
			}
		}
		else{
			System.out.println("Train number is invalid");
		}
		return "Train";
	}
	
	public static void main(String[] args){
		String trainRajdhani = getTrainName(11013);
		System.out.println("reference is: " + trainRajdhani);
		
		String trainPassenger = getTrainName(11014);
		System.out.println("reference is: " + trainPassenger);
		
		String trainMahamana = getTrainName(12134);
		System.out.println("reference is: " + trainMahamana);
		
		String trainHumsafar = getTrainName(22691);
		System.out.println("reference is: " + trainHumsafar);
	}
}