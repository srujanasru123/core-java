package Interface.com.app.ban.click;
import Interface.com.app.ApartmentRule;
import Interface.com.app.BuildApartmentRule;
import Interface.com.app.CommonApartmentRule;
import Interface.com.app.PurchaseApartmentRule;
import Interface.com.app.ban.PrestigeApartmentRule;
		

		public class ApartmentBuilder {

			public static void main(String[] args) {
				System.out.println("Invoking main in ApartmentBuilder");
				
				ApartmentRule rule=new PrestigeApartmentRule();
				PurchaseApartmentRule rule1=new PrestigeApartmentRule();
				CommonApartmentRule rule3=new PrestigeApartmentRule();
				BuildApartmentRule rule4=new PrestigeApartmentRule();
				
				rule1.construct();
				rule.construct();
				rule3.construct();
				rule4.construct();


				

			}


	}


