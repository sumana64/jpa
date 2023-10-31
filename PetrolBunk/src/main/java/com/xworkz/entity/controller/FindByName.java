package com.xworkz.entity.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.entity.PetrolBunkEntity;

public class FindByName {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

		EntityManager manager = factory.createEntityManager();

		Query query = manager.createNamedQuery("findByName");

		query.setParameter("name", "ance");

		List<PetrolBunkEntity> list = query.getResultList();
		
		if(list.isEmpty()) {
		
		System.out.println(list.toString());
		
		}else {
			
			System.out.println("entity is null");
		}
		
	

	}

}
