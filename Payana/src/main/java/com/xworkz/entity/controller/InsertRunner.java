package com.xworkz.entity.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.PayanaEntity;

public class InsertRunner {
	
	       public static void main(String[] args) {
	    	   
	    	       PayanaEntity entity = new PayanaEntity();
	    	       entity.setName("sanjay");
	    	       entity.setEmailId("rag1@gmail.com");
	    	       entity.setPhoneNo(7897568L);
	    	       entity.setAddress("ramanagar");
	    	       entity.setStartingFrom("vijaynagar");
	    	       entity.setDestination("davanagere");
	    	       entity.setNoOfPeople(4);
	    	       entity.setNoOfDays(2);
	    	       entity.setIdProof("drivingLicense");
	    	
			
	    	       EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	    	   
	    	       EntityManager manager =  factory.createEntityManager();
	    	       
	    	       EntityTransaction transaction = manager.getTransaction();
	    	       
	    	       transaction.begin();
	    	       
	    	       manager.persist(entity);
	    	       
	    	       transaction.commit();
	    	       
	    	       manager.close();
	    	   
	    	   
	    	   
	    	   
		}
	

}
