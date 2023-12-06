package com.xworkz.sru.boot;

import com.xworkz.sru.event.Function;

public class FunctionRunner {

	public static void main(String[] args) {
		Function function=new Function();
		function.clothes();
		try {
			function.food();
			Class.forName("com.just.not.work");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException which is checked exception");
			e.printStackTrace();
		}
	
	}

}
