package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.PilotRepository;

public class PilotServiceImpl implements PilotService  {
	private PilotRepository pilotRepository;

	public PilotServiceImpl(PilotRepository pilotRepository) {
		this.pilotRepository=pilotRepository;
	}

	@Override
	public boolean list(String names) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Pilot names is valid..");
			this.pilotRepository.fly(names);
		}
		else
		{
			System.err.println("Pilot names is invalid, cannot save..");
		}

		return false;
		
	}

}
