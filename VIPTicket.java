package Casting.Overriding;

public class VIPTicket extends Ticket {
	@Override
	public void entry() {
		System.out.println("Invoking no arg constructor in VIPTicket");
	}
}
