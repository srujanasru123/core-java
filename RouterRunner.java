package Casting.app;

public class RouterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in RouterRunner");
		Router router=new Router("143.967.09","WorkLoad","WERP","LAN");
		System.out.println(router.ipAddress);
		System.out.println(router.routing);
		System.out.println(router.server);
		System.out.println(router.portName);
		
		System.out.println("--------------------------");
		BaseRouter baserouter=new BaseRouter();
		System.out.println(baserouter.ipAddress);
		System.out.println(baserouter.routing);
		System.out.println(baserouter.server);
		System.out.println(baserouter.portName);
		
		System.out.println("--------------------------");
		BaseRouter baserouter1=new BaseRouter("678.987","WorkLoad","DHCP","LAN");
		System.out.println(baserouter1.ipAddress);
		System.out.println(baserouter1.routing);
		System.out.println(baserouter1.server);
		System.out.println(baserouter1.portName);
	}

	}


