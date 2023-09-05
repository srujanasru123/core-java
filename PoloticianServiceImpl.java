package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.PoliticianRepository;

public class PoloticianServiceImpl implements PoliticianService {
	private PoliticianRepository politicianRepository;

	public PoliticianServiceImpl(PoliticianRepository politicianRepository) {
		this.politicianRepository=politicianRepository;
	}

	@Override
	public boolean list(String names) {

		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Politician names is valid..");
			this.politicianRepository.list(names);
		}
		else
		{
			System.err.println("Politician names is invalid, cannot save..");
		}

		return false;

	
	}

}
