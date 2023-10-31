package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;

public interface PassPortService {

	       boolean ValidateAndSave(PassportDto dto);
	       
	       boolean FindById();
	
	

}
