package com.xworkz.map.boot;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AadharRunner {

	public static void main(String[] args) {
		
Map<String,String> aadharnumber =new HashMap<String,String>();
aadharnumber.put("Srujana R","419595616414");
aadharnumber.put("Ullas","986754676543");
aadharnumber.put("Shobha","456789876754");
aadharnumber.put("Sanju","123445677898");
aadharnumber.put("Raju","987665433212");
aadharnumber.put("Spoorthi","123454367896");
aadharnumber.put("Arpitha","987065435679");
aadharnumber.put("Sumanth","789947638423");
aadharnumber.put("Sushmitha","123445678998");
aadharnumber.put("Anitha","953527456911");
System.out.println("Total Pai:r"+aadharnumber.size());
System.out.println(aadharnumber.isEmpty());
Set<String>nameSet=aadharnumber.keySet();
nameSet.forEach(a->System.out.println(a));

System.out.println("====================================");
Collection<String>aadharCollection=aadharnumber.values();

System.out.println("------------------------------------");

Set<Entry<String,String>> namePair=aadharnumber.entrySet();
namePair.forEach(a->System.out.println(a));




	}

}
