package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "t_city")
@SecondaryTables(value = { @SecondaryTable(name = "tumkurCity") ,@SecondaryTable(name = "shivamogga") ,@SecondaryTable(name = "davanagere"),@SecondaryTable(name="bengaluru")})
public class CityEntity {
	
	@Id
	@Column(name = "t_id")          //metainf-private folder used to hide program from the user
	private int id;

	@Column(name = "t_name")
	private String name;
	
	@Column(name = "t_noOfAreas")
	private int noOfAreas;
	
	@Column(name = "t_roads",table = "bengaluru")
	private String roads;
	
	@Column(name = "t_education",table = "bengaluru")
	private String education;
	
	@Column(name = "t_transport",table = "bengaluru")
	private String transport;
	
	@Column(name = "t_offices",table = "bengaluru")
	private int offices;
	
	@Column(name = "t_noOfHospitals",table = "bengaluru")
	private String noOfHospitals;
	
	@Column(name = "t_population",table = "bengaluru")
	private int population;
	
	@Column(name = "t_noOfPolicies",table = "davanagere")
	private int noOfPolicies;
  

}
