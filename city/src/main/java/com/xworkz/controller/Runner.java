package com.xworkz.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.CityEntity;

public class Runner {

	public static void main(String[] args) {
		
	    CityEntity city = new CityEntity();
	    
	    city.setId(2);
	    city.setName("Dhanu");
		
		System.out.println("main method started");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println(factory);
		
	    EntityManager manager= factory.createEntityManager();
	    System.out.println(manager);
	    
	    EntityTransaction transaction =manager.getTransaction(); //used to to do any modification inthe table
	    System.out.println(transaction);
		
		transaction.begin();
		
		manager.persist(city);
		
		transaction.commit();
		
		manager.close();
		
		

	}

}

