package com.xworkz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "payana_info")
@NamedQuery(name = "FindAll",query = "select entity from  PayanaEntity entity")
public class PayanaEntity implements Serializable {
	
	        @Id
	        @Column(name = "t_id")
	        @GeneratedValue(strategy=GenerationType.IDENTITY)
	        private int id;
	        
	        @Column(name = "t_name")
	        private String name;
	        
	        @Column(name = "t_emailId")
	        private String emailId;
	        
	        @Column(name = "t_phoneNo")
	        private long phoneNo;
	        
	        @Column(name = "t_address")
	        private String address;
	        
	        @Column(name = "t_startingFrom")
	        private String startingFrom;
	        
	        @Column(name = "t_destination")
	        private String destination;
	        
	        @Column(name = "t_noOfPeople")
	        private int noOfPeople;
	        
	        @Column(name = "t_noOfDays")
	        private int noOfDays;
	        
	        @Column(name = "t_idProof")
	        private String idProof;
	        

}
