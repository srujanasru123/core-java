package com.association.applicatons.rule;

import com.association.applicatons.PassportVerification;

public class Safety implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("verfication is done for safety");

	}

}
