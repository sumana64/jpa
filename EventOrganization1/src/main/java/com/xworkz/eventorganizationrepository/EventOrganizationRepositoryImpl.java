package com.xworkz.eventorganizationrepository;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.eventOrganizationDto.EventOrganizationDto;
import com.xworkz.eventorganizationutil.EventOrganizationUtil;

public class EventOrganizationRepositoryImpl implements EventOrganizationRepository {
	
	EventOrganizationUtil util = new EventOrganizationUtil();

	@Override
	public boolean onSave(EventOrganizationDto dto) throws SQLException {
		
		
		System.out.println("Dto:" + dto);
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName,util.passsword);
		System.out.println("connection establisherd" + connection);
	
		
     	String query = "insert into event values(?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		System.out.println(preparedStatement);
		
		 preparedStatement.setInt(1, dto.getId());
		 preparedStatement.setString(2, dto.getName());
		 preparedStatement.setString(3, dto.getEmail());
		 preparedStatement.setLong(4, dto.getPhoneNo());
		 preparedStatement.setString(5, dto.getAddress());
		 preparedStatement.setString(6, dto.getEvent());
		 preparedStatement.setString(7, dto.getEventDate());
		 preparedStatement.setString(8, dto.getEventLocation());
		 preparedStatement.setString(9, dto.getEventToBeConducted());
		 preparedStatement.setInt(10, dto.getNoOfGuest());
		 preparedStatement.setInt(11, dto.getNoOfDays());
		 
		 System.out.println(preparedStatement);
		 
		 int rows=preparedStatement.executeUpdate();
		 
		 if(rows>0) {
			 System.out.println("rows affected");
           return true ;
		 }else {
			 System.out.println("rows are not affected");
			 return false;
		 }
	}

	/*@Override
	public boolean readAll() throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName,util.passsword);
		
		String query = "select * from event";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			
		System.out.println(" id : " + result.getInt(1) + " name: " + result.getString(2) +  " email: " +result.getString(3)  + " phoneno: " + result.getLong(4) + " address: " + result.getString(5) + " event:" + result.getString(6) + " eventDate: " + result.getString(7) + " eventLocation: " + result.getString(8) + " eventToBeConducted: " +  result.getString(9) + " noOfGuest : " + result.getInt(10) + " noOfDays: " + result.getInt(11));
		 
		    return true;
		}

		
		return false;
	}

	@Override
	public boolean read(String email, long phoneNo) throws SQLException {
		
	Connection connection = DriverManager.getConnection(util.urlName, util.userName,util.passsword);
		
		String query = "select * from event where email = ? and phoneNo = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		 preparedStatement.setString(1, email);
		 
		 preparedStatement.setLong(2, phoneNo);
		
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			
		System.out.println("id :" + result.getInt(1) + " name: " + result.getString(2) + "email: " +result.getString(3) + " phoneno: " + result.getLong(4) + " address: " + result.getString(5) + " event:" + result.getString(6) + " eventDate: " + result.getString(7) + " eventLocation: " + result.getString(8) + " eventToBeConducted: " +  result.getString(9) + " noOfGuest : " + result.getInt(10) + " noOfDays: " + result.getInt(11));
		 
		    return true;
		}
	   
		return false;
	}

	@Override
	public boolean update(String email, long phoneNo) throws SQLException {
		
        Connection connection = DriverManager.getConnection(util.urlName, util.userName,util.passsword);
		
		String query = "update event set email = ?, phoneNo=? " ;
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		System.out.println(preparedStatement);
		
		 preparedStatement.setString(1, email);
		 
		 preparedStatement.setLong(2, phoneNo);
		
		 int rows = preparedStatement.executeUpdate();
		 
		 if(rows>0) {
			
			 System.out.println("rows affected");
                 return true;
		 }else {
			
			 System.out.println("rows not affected");

			 return false;
		 }
	}

	@Override
	public boolean search1(String email) throws SQLException {
	
		Connection connection = DriverManager.getConnection(util.urlName, util.userName,util.passsword);
		
		String query = "select * from event where email = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		 preparedStatement.setString(1, email);
		
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			
		System.out.println("id :" + result.getInt(1) + " name: " + result.getString(2) + "email: " +result.getString(3) + " phoneno: " + result.getLong(4) + " address: " + result.getString(5) + " event:" + result.getString(6) + " eventDate: " + result.getString(7) + " eventLocation: " + result.getString(8) + " eventToBeConducted: " +  result.getString(9) + " noOfGuest : " + result.getInt(10) + " noOfDays: " + result.getInt(11));
		 
		    return true;
		}
		
		
		return false;
	}

	@Override
	public boolean search2(long phoneNo) throws SQLException {
	
		Connection connection = DriverManager.getConnection(util.urlName, util.userName,util.passsword);
		
		String query = "select * from event where phoneNo = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		 preparedStatement.setLong(1, phoneNo);
		
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			
		System.out.println("id :" + result.getInt(1) + " name: " + result.getString(2) + "email: " +result.getString(3) + " phoneno: " + result.getLong(4) + " address: " + result.getString(5) + " event:" + result.getString(6) + " eventDate: " + result.getString(7) + " eventLocation: " + result.getString(8) + " eventToBeConducted: " +  result.getString(9) + " noOfGuest : " + result.getInt(10) + " noOfDays: " + result.getInt(11));
		 
		    return true;
		}
		return false;
	}

	@Override
	public boolean search3(String name) throws SQLException {
		
	Connection connection = DriverManager.getConnection(util.urlName, util.userName,util.passsword);
		
		String query = "select * from event where name= ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		 preparedStatement.setString(1, name);
		
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			
		System.out.println("id :" + result.getInt(1) + " name: " + result.getString(2) + "email: " +result.getString(3) + " phoneno: " + result.getLong(4) + " address: " + result.getString(5) + " event:" + result.getString(6) + " eventDate: " + result.getString(7) + " eventLocation: " + result.getString(8) + " eventToBeConducted: " +  result.getString(9) + " noOfGuest : " + result.getInt(10) + " noOfDays: " + result.getInt(11));
		 
		    return true;
		}
		
		return false;
	}

	@Override
	public boolean delete(String email) throws SQLException {
		
	    Connection connection = DriverManager.getConnection(util.urlName, util.userName,util.passsword);
		
			String query = "delete from event where email = ?" ;
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			System.out.println(preparedStatement);
			
			 preparedStatement.setString(1, email);
			
			 int rows = preparedStatement.executeUpdate();
			 
			 if(rows>0) {
				 
				 System.out.println("rows affected");
			
				 return true;
			
			 }else {
				 
				 System.out.println("rows not affected");
				 
				 return false;
			 }
	}*/
	
	}


