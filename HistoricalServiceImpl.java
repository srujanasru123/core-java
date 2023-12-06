package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.HistoricalRepository;

public class HistoricalServiceImpl implements HistoricalService {
	private HistoricalRepository historicalRepository;
	public HistoricalServiceImpl(HistoricalRepository historicalRepository) {
		this.historicalRepository=historicalRepository;
	}
	@Override
	public boolean venue(String names) {
		// TODO Auto-generated method stub
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Historical Places names is valid..");
			this.historicalRepository.view(names);
		}
		else
		{
			System.err.println("Historical Places names is invalid, cannot save..");
		}
		return false;
	}

}
