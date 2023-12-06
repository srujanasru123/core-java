package com.association.applicatons.rule;

import com.association.applicatons.Internet;

public class Chrome implements Internet {

	@Override
	public void connect() {
		System.out.println("invoking connect to internet");

	}

}
