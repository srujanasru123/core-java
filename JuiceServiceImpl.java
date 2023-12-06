package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.JuiceRepository;

public class JuiceServiceImpl implements JuiceService {
	private JuiceRepository juiceRepository;

	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository=juiceRepository;
	}

	@Override
	public boolean validation(String name) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=5 && name.length()<=20)
		{
			System.out.println("juice names is valid..");
			if(!juiceRepository.IsExist(name))
			{
			this.juiceRepository.validation(name);
			return true;
			}
			else {
				System.out.println("juice names"+name+" already exists ,add another one");
			}
		}
		else
		{
			System.err.println("juice names is invalid, cannot save..");
		}
		return false;
	}

}

	
	


