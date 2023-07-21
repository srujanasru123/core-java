public class Personn{
	static int getAgeByName(String personName){
		System.out.println("Price of the cloth");
		if(personName != null){
			if(personName == "ullas"){
				System.out.println("person is: " + personName);
				return 22;
			}
			if(personName == "srujana"){
				System.out.println("person is: " + personName);
				return 35;
			}
			if(personName == "sru"){
				System.out.println("person is: " + personName);
				return 15;
			}
			if(personName == "sanju"){
				System.out.println("person is: " + personName);
				return 20;
			}
			if(personName == "punith"){
				System.out.println("person is: " + personName);
				return 19;
			}
			if(personName == "arpitha"){
				System.out.println("person is: " + personName);
				return 45;
			}
			if(personName == "pallavi"){
				System.out.println("person is: " + personName);
				return 16;
			}
			if(personName == "spoorthi"){
				System.out.println("person is: " + personName);
				return 38;
			}
			if(personName == "shobha"){
				System.out.println("person is: " + personName);
				return 25;
			}
			if(personName == "raju"){
				System.out.println("person is: " + personName);
				return 30;
			}
		}
		else{
			System.out.println("Age is not acceptable");
		}
		return 0;
	}
	public static void main(String[] args){
		int Ageullas = getAgeByName("ullas");
		System.out.println("reference is: " + Ageullas);
        int Agesrujana = getAgeByName("srujana");
		System.out.println("reference is: " + Agesrujana);
        int Agesru = getAgeByName("sru");
		System.out.println("reference is: " + Agesru);
		int Agesanju = getAgeByName("sanju");
		System.out.println("reference is: " + Agesanju);
		int Agepunith = getAgeByName("punith");
		System.out.println("reference is: " + Agepunith);
		double Agearpitha = getAgeByName("arpitha");
		System.out.println("reference is: " + Agearpitha);
		int Agepallavi = getAgeByName("pallavi");
		System.out.println("reference is: " + Agepallavi);
		int Agespoorthi = getAgeByName("spoorthi");
		System.out.println("reference is: " + Agespoorthi);
		int Ageshobha = getAgeByName("shobha");
		System.out.println("reference is: " + Ageshobha);
		int Ageraju = getAgeByName("raju");
		System.out.println("reference is: " + Ageraju);
	}
}
