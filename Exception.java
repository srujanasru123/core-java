package com.xworkz.police;

public class Exception {

	public void learn() {
		this.eat();
		System.out.println("info abt learn");

	}
   public void eat() {
	   this.sleep();
	System.out.println("info abt eat");
}
 public void sleep() {
	 System.out.println("running info");
	 try {
		this.write();
	
	} catch (java.lang.Exception e) {
		
		e.printStackTrace();
		System.err.println("Exception event handled");
	}
	System.out.println("info abt sleep");
}
  public void read() {
	  this.write();
		System.out.println("info abt sleep");
  }
  public void write() {
	  throw new NumberFormatException("unchecked");
	
  }
  
  public static void main (String[] args){
	  System.out.println("info abt Exception");
	  Exception exception = new Exception();
	  exception.eat();
  }
}