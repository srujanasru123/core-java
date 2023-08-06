package Casting.app;

public class BaseRouter extends Router {
	public BaseRouter()
	{
		this("143.967.09","WorkLoad","WERP","LAN");
		System.out.println("Invoking no-args in BaseRouter");
	}
	public BaseRouter(String ipAddress,String routing,String server,String portName)
	{
		super(ipAddress,routing,server,portName);
		System.out.println("Invoking String in BaseRouter");
	}
}
