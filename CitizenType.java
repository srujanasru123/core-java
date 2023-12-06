package com.xworkz.crackers.constants;


	public enum CitizenType {
		GLOBAL(18,50,"Ullas"),SINGLE(17,55,"Srujana"),OVERSEAS(13,60,"Amma");
		private Integer lowerAgeLimit;
		private Integer upperAgeLimit;
		private String name;
		private CitizenType(Integer lowerAgeLimit, Integer upperAgeLimit, String name) {
			this.lowerAgeLimit = lowerAgeLimit;
			this.upperAgeLimit = upperAgeLimit;
			this.name = name;
		}
		public Integer getLowerAgeLimit() {
			return lowerAgeLimit;
		}
		public Integer getUpperAgeLimit() {
			return upperAgeLimit;
		}
		public String getName() {
			return name;
		}
		public void setLowerAgeLimit(Integer lowerAgeLimit) {
			this.lowerAgeLimit = lowerAgeLimit;
		}
		public void setUpperAgeLimit(Integer upperAgeLimit) {
			this.upperAgeLimit = upperAgeLimit;
		}
		public void setName(String name) {
			this.name = name;
		}


}
