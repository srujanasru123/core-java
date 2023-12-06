package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.PatientRepository;

public class PatientServiceImpl implements PatientService {
	private PatientRepository patientRepository;

	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository=patientRepository;
	}
	@Override
	public boolean care (String names) {
		// TODO Auto-generated method stub
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Patient names is valid..");
			this.patientRepository.care(names);
		}
		else
		{
			System.err.println("Patient names is invalid, cannot save..");
		}
		return false;
	}

}
