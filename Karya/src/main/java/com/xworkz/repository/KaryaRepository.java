package com.xworkz.repository;

import java.sql.SQLException;

import com.xworkz.dto.KaryaDto;

public interface KaryaRepository {
	
	boolean onSave(KaryaDto dto) throws ClassNotFoundException, SQLException;

}
