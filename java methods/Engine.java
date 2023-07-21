public class Engine{
	static int getCCByModel(String carName){
		if(carName != null){
			   System.out.println("car name is valid: ");
			if(carName == "bmw"){
				System.out.printf("carName is: %s\n",  carName);
				return 100;
			}
			if(carName == "ford"){
				System.out.printf("carName is: %s\n",  carName);
				return 130;
			}
			if(carName == "ferrari"){
				System.out.printf("carName is: %s\n",  carName);
				return 120;
			}
			if(carName == "swift"){
				System.out.printf("carName is: %s\n",  carName);
				return 110;
			}
			if(carName == "bently"){
				System.out.printf("carName is: %s\n",  carName);
				return 150;
			}
			if(carName == "benz"){
				System.out.printf("carName is: %s\n",  carName);
				return 160;
			}
		}
		else{
			System.out.println("carName is invalid");
		}
		return 1;
	}
	
	public static void main(String[] args){
		int ccBmw = getCCByModel("bmw");
		System.out.println("Reference is: " + ccBmw);
		
		int ccFord = getCCByModel("ford");
		System.out.println("Reference is: " + ccFord);
		
		int ccFerrari = getCCByModel("ferrari");
		System.out.println("Reference is: " + ccFerrari);
		
		int ccBenz = getCCByModel("benz");
		System.out.println("Reference is: " + ccBenz);
		
		int ccBently = getCCByModel("bently");
		System.out.println("Reference is: " + ccBently);
		
		int ccSwift = getCCByModel("swift");
		System.out.println("Reference is: " + ccSwift);
	}
}