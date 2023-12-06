package com.xwokz.impl;

import com.xworkz.app.RTORule;
import com.xworkz.app.rule.CompanyRule;
import com.xworkz.app.rule.TaxpayerRule;

public class  Citizen implements TaxpayerRule, RTORule ,CompanyRule{

	@Override
	public void payRoadTax() {
     System.out.println("invoking payroad");
	}

	@Override
	public void gst() {
		System.out.println("invoking gst");
		CompanyRule.super.deductPf();
	}

	@Override
	public void payTds() {
		System.out.println("invoking paytds");
		CompanyRule.super.deductPf();
	}

	@Override
	public void deductPf() {
		// TODO Auto-generated method stub
		
	}

	
	
}
