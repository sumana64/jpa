package com.workz.passport.repository;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;

public interface PassPortRepository {
	
	boolean OnSave(PassportDto dto);

	boolean findById();

}
