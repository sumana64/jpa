package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.dto.KaryaDto;
import com.xworkz.util.KaryaUtil;

public class KaryaRepositoryImpl implements KaryaRepository{
	
	KaryaUtil util = new KaryaUtil();


	@Override
	public boolean onSave(KaryaDto dto) throws ClassNotFoundException, SQLException {
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
		  
		  String query = "insert into karya values(?,?,?,?,?,?,?,?,?,?)";
		  
		 PreparedStatement statement =  connection.prepareStatement(query);	
		 
		 statement.setInt(1,dto.getId());
		 statement.setString(2, dto.getName());
		 statement.setLong(3, dto.getPhoneNo());
		 statement.setString(4, dto.getAddress());
		 statement.setString(5, dto.getEvent());
		 statement.setString(6, dto.getEventDate());
		 statement.setString(7, dto.getEventLocation());
		 statement.setInt(8, dto.getNoOfGuest());
		 statement.setInt(9, dto.getNoOfDays());
		 statement.setDouble(10, dto.getPrice());
		 
		 int rows = statement.executeUpdate();
		 
		 if(rows>0) {
			 System.out.println("rows effected");
			 return true;
		 }else
		 
		 System.out.println("rows are not effected");
		return false;
	}
	}
	


