package com.xworkz.builtinin;

public class StringBuilderRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder build=new StringBuilder("Ullas D From Shivamogga");
		
	
		System.out.println(build);
		
		StringBuilder builder= build.deleteCharAt(0);
		System.out.println(builder);
		
		int a=build.indexOf("D");
		System.out.println("The index of character d is "+a);
		
		builder=build.reverse();
		System.out.println(builder);
		
		builder=build.reverse();
		System.out.println(builder);
		
		String name="auto";
		
		int i=build.lastIndexOf(name);
		System.out.println("The last index of name is "+i);
		
		
		builder=build.append(false);
		System.out.println(builder);
	}

}
