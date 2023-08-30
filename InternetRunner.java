package com.association.applicatons.rule.boot;

import com.association.applicatons.Internet;
import com.association.applicatons.rule.Browser;
import com.association.applicatons.rule.Chrome;

public class InternetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in InternetRunner");
		Internet internet=new Chrome();
		Browser browser=new Browser();
		browser.setInternet(internet);
		browser.connect();
	}
	

}
