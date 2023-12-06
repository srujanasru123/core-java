package com.association.applicatons.rule;

import com.association.applicatons.Internet;

public class Edge implements Internet {

	@Override
	public void connect() {
	System.out.println("invoking edge in internet");

	}

}
