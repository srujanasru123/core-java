package com.association.applicatons.rule;

import com.association.applicatons.Internet;

public class Browser {
	private Internet internet;

	public void connect() {
		System.out.println("invoking connect in Browser");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		System.out.println("invoking setInternet in Browser");
		this.internet = internet;
	}

}
