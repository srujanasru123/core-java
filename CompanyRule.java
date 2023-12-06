package com.xworkz.app.rule;

public interface CompanyRule {

	void payTds();
	
	default void deductPf()
	{
		
	}
	
}
