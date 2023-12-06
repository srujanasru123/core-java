package com.xworkz.builtinin;

public class StringBufferRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer buf=new StringBuffer();
		
		StringBuffer res=buf.append(false);
		System.out.println(res);
		
		res=buf.append(' ');
		System.out.println(res);
		
		res=buf.append('1');
		System.out.println(res);
		
		res=buf.append(" Vinay");
		System.out.println(res);
		
		res=buf.append(' ');
		System.out.println(res);
		
		res=buf.append(10.28);
		System.out.println(res);

		res=buf.append(' ');
		System.out.println(res);
		
		res=buf.append(120);
		System.out.println(res);


		
	}
	

}
