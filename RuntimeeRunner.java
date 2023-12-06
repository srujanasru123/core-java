package Usecode.different.app;

public class RuntimeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime runtime = new Runtime();
		System.out.println("Instance method");
		int ref = runtime.availableProcessors();
		System.out.println(ref);
		boolean ref1 = runtime.equals(runtime);
		System.out.println(ref1);
		long ref2 = runtime.freeMemory();
		System.out.println(ref2);
		int ref3 = runtime.hashCode();
		System.out.println(ref3);
		long ref4 = runtime.maxMemory();
		System.out.println(ref4);
		System.out.println("Static method");

	}
	}


