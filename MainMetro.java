package Interface.com.app.ban.click;

import Interface.com.app.Metro;
import Interface.com.app.ban.MetroRules;

public class MainMetro {

			public static void main(String[] args) {
				MetroRules metroRules = new MetroRules();
				metroRules.announcement('F');
				metroRules.payment(14.25);
				metroRules.timings(11);

			}
	}


