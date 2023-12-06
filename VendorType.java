package com.xworkz.crackers.constants;


	public enum VendorType {
		AMAZON("342ZO",3453,"Srujana"),FLIPKART("561FL",6780,"Ullas"),AJIO("907AJ",5460,"Shobha"),MYNTRA("567MN",1342,"Sanju");
		private String gstNo;
		private Integer serialNo;
		private String name;
		private VendorType(String gstNo, Integer serialNo, String name) {
			this.gstNo = gstNo;
			this.serialNo = serialNo;
			this.name = name;
		}
		public String getGstNo() {
			return gstNo;
		}
		public Integer getSerialNo() {
			return serialNo;
		}
		public String getName() {
			return name;
		}
		public void setGstNo(String gstNo) {
			this.gstNo = gstNo;
		}
		public void setSerialNo(Integer serialNo) {
			this.serialNo = serialNo;
		}
		public void setName(String name) {
			this.name = name;
		}

}
