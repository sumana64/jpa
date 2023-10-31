package com.xworkz.passport.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "passport_info")
public class PassportEntity {
	
	@Id
	@Column(name ="p_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="p_name")
    private String name;
    
	@Column(name ="p_email")
    private String email;
    
	@Column(name ="p_phoneNo")
    private Long phoneNo;
    
	@Column(name ="p_address")
    private String address;
    
	@Column(name ="p_date")
    private Date date;
    
	@Column(name ="p_confirmPassword")
	private String confirmPassword;
    
	@Column(name ="p_officeLocation")
    private String officeLocation;
    
	@Column(name ="p_adharNo")
    private Long adharNo;
    
	@Column(name ="p_panNo")
	private String panNo;

}
