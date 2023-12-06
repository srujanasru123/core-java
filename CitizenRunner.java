package com.xworkz.app.rule.impl.boot;

import com.xwokz.impl.Citizen;
import com.xworkz.app.RTORule;

public class CitizenRunner {

	public static void main(String[] args) {

		System.out.println("invoking main CitizenRunner");
		RTORule ref1 = new Citizen();
		ref1.payRoadTax();
		ref1.payCess();
	}

}
