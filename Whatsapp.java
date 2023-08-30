package com.association.applicatons.rule;

import com.association.applicatons.SocialMedia;

public class Whatsapp {
	private SocialMedia socialMedia;

	public void connect() {
		System.out.println("invoking connect in Whatsapp");
		this.socialMedia.connect();
	}

	public void setMedia(SocialMedia socialMedia) {
		System.out.println("invoking setMedia in Whatsapp");
		this.socialMedia = socialMedia;
	}

}
