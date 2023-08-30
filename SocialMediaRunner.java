package com.association.applicatons.rule.boot;

import com.association.applicatons.SocialMedia;
import com.association.applicatons.rule.Whatsapp;

public class SocialMediaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in SocialMediaRunner");
		SocialMedia socialMedia=new Facebook();
		Whatsapp whatsapp=new Whatsapp();
		whatsapp.setMedia(socialMedia);
		whatsapp.connect();

	}

}
