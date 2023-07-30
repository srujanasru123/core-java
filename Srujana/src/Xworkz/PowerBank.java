package Xworkz;

public class PowerBank {
		Battery battery=new Battery();
		public void power() {
			System.out.println("invoking power from PowerBank");
			this.battery.stores();
			this.battery.capacity();
		}

	}


