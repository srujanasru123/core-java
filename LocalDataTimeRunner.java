package Usecode.different.app;

public class LocalDataTimeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				LocalDateTime localDateTime = new LocalDateTime();
				boolean ref = localDateTime.equals(localDateTime);
				System.out.println(ref);
				int ref1 = localDateTime.hashCode();
				System.out.println(ref1);
				String ref2 = localDateTime.toString();
				System.out.println(ref2);

			}

	}


