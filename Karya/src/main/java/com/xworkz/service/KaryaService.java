package com.xworkz.service;

import java.sql.SQLException;

import com.xworkz.dto.KaryaDto;

public interface KaryaService {
	
	boolean onSave(KaryaDto dto) throws ClassNotFoundException, SQLException;

}
