package com.xworkz.entity.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ReadRunner {

	public static void main(String[] args) {
	
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		 
		 EntityManager manager = factory.createEntityManager();
		 
		 Query query = manager.createNamedQuery("findAll"); //transaction is not needed to find or read or search..we use query
		  
		 List list = query.getResultList();
		 
		 System.out.println(list.toString());
		 
		 System.out.println(list.size());
		 
		 

	}

}
