package com.xworkz.passport.controller;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.service.PassPortService;
import com.xworkz.passport.service.PassPortServiceImpl;

public class PassportController {

	public static void main(String[] args) {
		
		
		PassportDto dto = new PassportDto("savitha","sa@gmail.com",896765457L,"vijaynagar", new Date(),"savitha123","whitefield",676547467742L, "BG234GFDC");
		System.out.println(dto.toString());
		
		//PassportEntity entity = new PassportEntity();
		
		PassPortService service = new PassPortServiceImpl();
		//service.ValidateAndSave(dto);
		
		service.FindById();
		            

	}

}
