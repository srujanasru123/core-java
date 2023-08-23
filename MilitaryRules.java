package Interface.com.app.ban;

import Interface.com.app.Military;

public class MilitaryRules implements Military {

	@Override
	public String HairCut(String name) {
		System.out.println("Haircuttting is a imp");
		return null;
	}

	@Override
	public boolean WearUnifiorm() {
		System.out.println("uniform is a imp");
		return false;
	}

	@Override
	public double height(double height) {
		System.out.println("Height is a imp");
		return 0;
	}

}
