package com.xworkz.service;

import java.sql.SQLException;

import com.xworkz.dto.KaryaDto;
import com.xworkz.repository.KaryaRepository;
import com.xworkz.repository.KaryaRepositoryImpl;

public class KaryaServiceImpl implements KaryaService {
	
	KaryaRepository repo = new KaryaRepositoryImpl();

	@Override
	public boolean onSave(KaryaDto dto1) throws ClassNotFoundException, SQLException {
		boolean isAdded = false;
		if(dto1!=null) {
			repo.onSave(dto1);
		}
		return isAdded;
	}

}
