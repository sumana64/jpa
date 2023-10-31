package com.xworkz.entity.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.PetrolBunkEntity;

public class UpdateRunner {
	
	   public static void main(String[] args) {
			
	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	    		
	    EntityManager manager = factory.createEntityManager();
	    
	    PetrolBunkEntity entity = manager.find(PetrolBunkEntity.class, 1);
	    
	    System.out.println(entity);
	    
	    if(entity!=null) {
	    
	    EntityTransaction transaction=manager.getTransaction();
	    
	    transaction.begin();
	    
	    entity.setAddress("jayanagar");
	    
	    entity.setNoOfEmployess(20);
	    
	    manager.merge(entity);
	    
	    System.out.println(entity);
	    
	    transaction.commit();
	    
	    manager.close();
	    
	    }else {
	    	
	    	System.out.println("entity is null");
	    }
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
		}
	       

}
