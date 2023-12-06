package com.xworkz.crackers;

import com.xworkz.crackers.constants.CitizenType;
import com.xworkz.crackers.dto.CitizenTypeDTO;

public class CitizenTypeRunner {

			public static void main(String[] args) {
				CitizenTypeDTO type=new CitizenTypeDTO(CitizenType.SINGLE, 12, 100, "Mounika");
				System.out.println(type);
				System.out.println(type.getCitizenType().getLowerAgeLimit());
				System.out.println(type.getCitizenType().getUpperAgeLimit());
				System.out.println(type.getCitizenType().getName());


			}

		}

	


