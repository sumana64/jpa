package com.xworkz.passport.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassportDto {
	
	    private String name;
	    
	    private String email;
	    
	    private Long phoneNo;
	    
	    private String address;
	    
	    private Date date;
	    
	    private String confirmPassword;
	    
	    private String officeLocation;
	    
	    private Long adharNo;
	    
	    private String panNo;
	    
	    
	    
	    

}
