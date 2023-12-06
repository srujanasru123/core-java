package com.xworkz.mobile;

import java.util.Collection;
import java.util.LinkedList;

public class TheaterRunner {

	public static void main(String[] args) {
		
		TheaterDTO theater = new TheaterDTO ("venkatesh",100,"The villian",true);
		TheaterDTO theater1 = new TheaterDTO ("city center",50,"Ugramm",true);
		TheaterDTO theater2 = new TheaterDTO ("pvr",100,"Akash",true);
		TheaterDTO theater3 = new TheaterDTO ("lakshmi",50,"Abhi",true);
		
		
		
		
		Collection<TheaterDTO> ref = new LinkedList<TheaterDTO>();
		
		ref.add(theater);
		ref.add(theater1);
		ref.add(theater2);
		ref.add(theater3);

	}

}
