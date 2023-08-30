package com.association.applicatons.rule.boot;

import com.association.applicatons.Software;
import com.association.applicatons.rule.Application;
import com.association.applicatons.rule.SoftwareDeveloper;

public class SoftwareRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in SoftwareRunner");
		Software software=new Application();
		SoftwareDeveloper softwareDev=new SoftwareDeveloper();
		softwareDev.setSoftware(software);
		softwareDev.program();
	}
	

}
