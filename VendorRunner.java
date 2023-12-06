package com.xworkz.crackers;

import com.xworkz.crackers.constants.VendorType;
import com.xworkz.crackers.dto.VendorTypeDTO;

public class VendorRunner {

	public static void main(String[] args) {
		
				VendorTypeDTO dto=new VendorTypeDTO(VendorType.FLIPKART, "Punith", "FLP5670",6578 );
				System.out.println(dto);
				System.out.println(dto.getVendorType().getName());
				System.out.println(dto.getVendorType().getGstNo());
				System.out.println(dto.getVendorType().getSerialNo());
			}
		
	

}
