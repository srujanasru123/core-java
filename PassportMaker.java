package com.association.applicatons.rule.boot;

public class PassportMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in PassPortMaker");
		PassportVerification verification=new Safety();
		Custom custom=new Custom();
		custom.setVerification(verification);
		custom.verifyCitizen();

	}

}
