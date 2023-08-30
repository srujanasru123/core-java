package com.association.applicatons.rule;

import com.association.applicatons.Software;

public class SoftwareDeveloper {

		private Software software;

		public void program() {
			System.out.println("invoking program in Softwaredev");
			this.software.program();
		}

		public void setSoftware(Software software) {
			System.out.println("invoking setSoftware in SoftwareDev");
			this.software = software;
		}

}
