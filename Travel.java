package com.association.applicatons.rule;

import com.association.applicatons.PassportVerification;

public class Travel implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("citizen travels a lot");

	}

}
