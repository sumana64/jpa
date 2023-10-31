package com.xworkz.entity.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.PetrolBunkEntity;

public class CreateRunner {
	
	public static void main(String[] args) {
	
	PetrolBunkEntity entity = new PetrolBunkEntity();
	entity.setIfscCode("FVGBHNJ23");
	entity.setName("indian_oil");
	entity.setPhoneNo(89765436L);
	entity.setAddress("nagarbhavi");
	entity.setNoOfEmployess(8);
	entity.setFuels("petrol");
	entity.setNoOfCounters(3);
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	
    EntityManager manager = factory.createEntityManager();
    
    EntityTransaction transaction  =  manager.getTransaction(); //transaction is needed for insert..update..delete
    
    transaction.begin();
    
    manager.persist(entity);
    
    transaction.commit();
    
    manager.close();
     
    
	}
}
