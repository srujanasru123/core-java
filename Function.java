package com.xworkz.sru.event;

import com.xworkz.sru.exception.BookRunTimeException;

public class Function {
	
public void clothes() {
	throw  new NumberFormatException("unchecked");
	
}
public void food() throws ClassNotFoundException {
	
	throw new BookRunTimeException();
}
}
