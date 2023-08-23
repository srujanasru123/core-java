package Interface.com.app.ban.click;
import Interface.com.app.Military;
import Interface.com.app.ban.MilitaryRules;

public class MilitaryRunner {

	public static void main(String[] args) {
		
		Military military = new MilitaryRules();
		military.HairCut("Ullas");
		military.height(5.8);
		military.WearUnifiorm();
	}

}



