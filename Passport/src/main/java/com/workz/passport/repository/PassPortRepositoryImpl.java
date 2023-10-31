package com.workz.passport.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;

public class PassPortRepositoryImpl implements PassPortRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	
	PassportEntity entity = new PassportEntity();


	@Override
	public boolean OnSave(PassportDto dto) {
		System.out.println("u can save the data");

		EntityManager manager = factory.createEntityManager();

		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPhoneNo(dto.getPhoneNo());
		entity.setAddress(dto.getAddress());
		entity.setDate(dto.getDate());
		entity.setConfirmPassword(dto.getConfirmPassword());
		entity.setOfficeLocation(dto.getOfficeLocation());
		entity.setAdharNo(dto.getAdharNo());
		entity.setPanNo(dto.getPanNo());
		System.out.println(entity);

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		manager.persist(entity);

		transaction.commit();

		manager.close();

		return false;
	}

	@Override
	public boolean findById() {

		EntityManager manager = factory.createEntityManager();

		PassportEntity entity1 = manager.find(PassportEntity.class,1);

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		entity1.setEmail("savitha123@gmail.com");
		
		manager.merge(entity1);

		transaction.commit();

		manager.close();

		return false;
	}

}
