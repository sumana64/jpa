package com.xworkz.entity.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.xworkz.entity.PetrolBunkEntity;

public class RunnerDelete {

	public static void main(String[] args) {

		            
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");		
		
		 EntityManager manager =  factory.createEntityManager();
		        		 
		 PetrolBunkEntity entity = manager.find(PetrolBunkEntity.class, 3);
		   
		 System.out.println(entity);
		   
		 EntityTransaction  transaction = manager.getTransaction();
		
         transaction.begin();
                     
         manager.remove(entity);
                     
         transaction.commit();
	
	     System.out.println(entity);
	                
	     manager.close();
	
	
	}

}
