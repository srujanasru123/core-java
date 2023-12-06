package com.xworkz.police;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class StreamRunner {

	public static void main(String[] args) {
		Collection<String> roleCollection = new LinkedList<String>();
		roleCollection.add("Software Engineer");
		roleCollection.add("Java developer");
		roleCollection.add("Recruiter");
		roleCollection.add("human Resource");
		roleCollection.add("Performance tester");
		roleCollection.add("Automation tester");
		roleCollection.add("Data Engineer");
		roleCollection.add("Business Analyst");
		roleCollection.add("Manager");
		
		for (String role : roleCollection) {
			if (role.endsWith("Tester")) {
				System.out.println(role);
			}
		}
		
		
		System.out.println("=================");
		roleCollection.stream().filter((role)->role.endsWith("tester")).forEach(r->System.out.println(r));
		System.out.println("=================");
		
	}

}
