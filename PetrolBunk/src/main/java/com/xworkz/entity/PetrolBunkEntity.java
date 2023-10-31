package com.xworkz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "petrolBunk")
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findAll",query = "select entity from PetrolBunkEntity entity")
@NamedQuery(name="findByName",query = "select bunk from PetrolBunkEntity bunk where bunk.name=:name")
public class PetrolBunkEntity implements Serializable {
	
	  @Id
	  @Column(name = "p_id")
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int id;
	  
	  @Column(name = "p_IfscCode")
	  private String IfscCode;
	  
	  @Column(name = "p_name")
      private String name;
	  
	  @Column(name = "p_phoneNo")
	  private long phoneNo;
	  
	  @Column(name = "p_address")
	  private String address;
	  
	  @Column(name = "p_noOfEmployess")
	  private int noOfEmployess;
	  
	  @Column(name = "p_fuels")
	  private String fuels;
	  
	  @Column(name = "p_noOfCounters")
	  private int noOfCounters;
	
	
}
