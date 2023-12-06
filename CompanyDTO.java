package com.xworkz.map.boot;

import java.util.Set;

public class CompanyDTO {
	String name;
	String location;
	int gst;
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public int getGst() {
		return gst;
	}
	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", location=" + location + ", gst=" + gst + "]";
	}
	public CompanyDTO(String name, String location, int gst) {
		super();
		this.name = name;
		this.location = location;
		this.gst = gst;
	}
	public CompanyDTO() {
		super();
		
	}
	public static Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
