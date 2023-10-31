package com.xworkz.dto;

import lombok.Data;

@Data
public class KaryaDto {
	
	private int id;
	private String name;
	private long phoneNo;
	private String address;
	private String event;
	private String eventDate;
	private String eventLocation;
	private int noOfGuest;
	private int noOfDays;
	private double price;

}
