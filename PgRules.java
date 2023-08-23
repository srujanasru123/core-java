package Interface.com.app.ban;

import Interface.com.app.Pg;

public class PgRules implements Pg {

	@Override
	public double rent() {
		System.out.println("Rent is mandatory");
		return 0;
	}

	@Override
	public int NightTimings() {
		System.out.println("coming late night are not allowed");
		return 0;
	}

	@Override
	public boolean BoysnotAllowed() {
		System.out.println("boys not allowed");
		return true;
	}

}
