package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.MedicineRepository;

public class MedicineServiceImpl implements MedicineService {
	private MedicineRepository medicineRepository;
	public MedicineServiceImpl(MedicineRepository medicineRepository) {
		this.medicineRepository=medicineRepository;
	}
	@Override
	public boolean list(String names) {
		// TODO Auto-generated method stub
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Medicine names is valid..");
			this.medicineRepository.cure(names);
		}
		else
		{
			System.err.println("Medicine names is invalid, cannot save..");
		}
		return false;
	}

}
