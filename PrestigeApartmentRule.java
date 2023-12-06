package Interface.com.app.ban;
import Interface.com.app.ApartmentRule ;

	public class PrestigeApartmentRule implements ApartmentRule{
		
		@Override
		public void construct() {
			System.out.println("invoking constructor() in PrestigeApartmentRule");
			
		}
}
