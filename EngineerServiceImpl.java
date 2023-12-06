package com.xworkz.app.repositoryservice;

import com.xworkz.app.dto1.EngineerDTO;
import com.xworkz.app.repository.EngineerDTORepository;

public class EngineerServiceImpl implements EngineerService {
	private EngineerDTORepository engineerdtorepository;
	private int position;

	public EngineerServiceImpl(EngineerDTORepository engineerdtorepository) {
		this.engineerdtorepository = engineerdtorepository;
	}

	@Override
	public boolean validateandsave(EngineerDTO dto) {
		System.out.println("invoking validate and save" + this.getClass().getName());
		if (dto != null) {
			System.out.println("Engineer data is valid" + this.position);
			int id = dto.getId();
			String name = dto.getName();
			String collageName = dto.getCollegeName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20)
				;
			{
				System.out.println("Engineer" + dto.getName() + "is valid");
			}

		} else {
			System.out.println("name is invalid");
			return false;
		}

		if (id > 0) {
			System.out.println("Engineer"+ dto.getId()+" is valid");
		}
		else {
			System.out.println("id is invalid");
			

		}

	}
}
