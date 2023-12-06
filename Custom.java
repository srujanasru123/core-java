package com.association.applicatons.rule;

import com.association.applicatons.PassportVerification;

public class Custom {
	private PassportVerification verification;
	public void verifyCitizen()
	{
		System.out.println("invoking verifyCitizen in Custom");
		this.verification.verifyCitizen();
	}
	public void setVerification(PassportVerification verification)
	{
		System.out.println("invoking setVerification in Custom");
		this.verification=verification;
	}
}
