package Casting.Overriding;

public class TicketPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Running main in TicketRunner");
		
		Ticket ticket=new VIPTicket();
		ticket.entry();
	}

}
