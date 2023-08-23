package Interface.com.app.ban;

import Interface.com.app.Temple;

public class PeopleTemple implements Temple {
@Override
	public boolean queue() {
		System.out.println("temple has queue");
		
		return false;
	}

	@Override
	public double darshanatiming(String Godname) {
		System.out.println("temple has darshanatimimgs");
		return 8;
	}

	@Override
	public boolean security() {
		System.out.println("temple has security");
		return true;
	}

}
