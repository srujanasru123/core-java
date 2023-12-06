package com.xworkz.app;

public interface RTORule {
	
	public abstract void payRoadTax();

	default int payCess() {
		return  100;
	}
	
}
