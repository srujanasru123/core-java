package Interface.com.app.ban;

import Interface.com.app.Engneering;

public class EngneeringRules implements Engneering {

	@Override
	public boolean attendence(String name) {
		System.out.println("Attendance is mandatory");
		return false;
	}

	@Override
	public double average(double average) {
		System.out.println("scoring avrage is mandatory");
		return 0;
	}

	@Override
	public boolean WearId() {
		System.out.println("WearingId is mandatory");
		return true;
	}

}
