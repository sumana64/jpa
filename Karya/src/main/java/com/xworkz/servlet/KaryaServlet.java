package com.xworkz.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.KaryaDto;
import com.xworkz.service.KaryaService;
import com.xworkz.service.KaryaServiceImpl;

@WebServlet(urlPatterns = "/register")
public class KaryaServlet extends HttpServlet {
	
	public KaryaServlet() {
		
		System.out.println("servlet is started");
	}
	
	public void init() {
		
		 dto = new KaryaDto();
		 service = new KaryaServiceImpl();
	}
	  
	KaryaDto dto;
	KaryaService service;
	     
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
	    long phoneNo = Long.parseLong(req.getParameter("phoneNo"));
	    String address = req.getParameter("address");
		String event = req.getParameter("event");
		String eventDate = req.getParameter("eventDate");
		String eventLocation = req.getParameter("eventLocation");
		int noOfGuest = Integer.parseInt(req.getParameter("noOfGuest"));
		int noOfDays = Integer.parseInt(req.getParameter("noOfDays"));
		double price = Double.parseDouble(req.getParameter("price"));
		
		dto.setId(id);
		dto.setName(name);
		dto.setPhoneNo(phoneNo);
		dto.setAddress(address);
		dto.setEvent(event);
		dto.setEventDate(eventDate);
		dto.setEventLocation(eventLocation);
		dto.setNoOfGuest(noOfGuest);
		dto.setNoOfDays(noOfDays);
		dto.setPrice(price);
		
		try {
			service.onSave(dto);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		req.setAttribute("d", dto);
		RequestDispatcher result= req.getRequestDispatcher("success.jsp");
		result.forward(req, res);
		
		
		
	}

}
