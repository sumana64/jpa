package com.xworkz.passport.service;

import com.workz.passport.repository.PassPortRepository;
import com.workz.passport.repository.PassPortRepositoryImpl;
import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;

public class PassPortServiceImpl implements  PassPortService{
	
	PassPortRepository repo = new PassPortRepositoryImpl();

	@Override
	public boolean ValidateAndSave(PassportDto dto) {
		if(dto!=null) {
			
			System.out.println("you can save the data");
			repo.OnSave(dto);
			return true;	
		}else
			System.out.println("dto is null");
		return false;
		
	}

	@Override
	public boolean FindById() {
			repo.findById();
               return true;
		}
	}

	


