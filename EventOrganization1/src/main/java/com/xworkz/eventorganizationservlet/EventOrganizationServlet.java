package com.xworkz.eventorganizationservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.eventOrganizationDto.EventOrganizationDto;
import com.xworkz.eventorganizationservice.EventOrganizationService;
import com.xworkz.eventorganizationservice.EventOrganizationServiceImpl;

@WebServlet(urlPatterns = "/register")
public class EventOrganizationServlet extends HttpServlet {
	
	 EventOrganizationDto dto = new  EventOrganizationDto();
	 
	 EventOrganizationService service = new EventOrganizationServiceImpl();
	
	public EventOrganizationServlet() {
		
		System.out.println("servlet is started");
	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("Id"));
	String name = req.getParameter("UserName");		
	String email = req.getParameter("Email");		
	long phoneNo = Long.parseLong(req.getParameter("PhoneNo"));		
	String address = req.getParameter("Address");	
	String event = req.getParameter("Event");
	String eventdate = req.getParameter("EventDate");
	String eventLocation = req.getParameter("EventLocation");
	String eventToBeConducted = req.getParameter("EventToBeConducted");
	int noOfGuest = Integer.parseInt("NoOfGuest");
	int noOfDays = Integer.parseInt("NoOfDays");
	
	dto.setId(id);
	dto.setName(name);
	dto.setEmail(email);
	dto.setPhoneNo(phoneNo);
	dto.setAddress(address);
	dto.setEvent(event);
	dto.setEventDate(eventdate);
	dto.setEventLocation(eventLocation);
	dto.setEventToBeConducted(eventToBeConducted);
	dto.setNoOfGuest(noOfGuest);
	dto.setNoOfDays(noOfDays);
	

	try {
		boolean save = service.onSave(dto);
	
	if(save) {
		System.out.println("successfull method");
	}else {
		System.out.println("unsuccessfull");
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(email);
	System.out.println(phoneNo);
	System.out.println(address);
	System.out.println(event);
	System.out.println(eventdate);
	System.out.println(eventLocation);
	System.out.println(eventToBeConducted);
	System.out.println(noOfGuest);
	System.out.println(noOfDays);
	
	req.setAttribute("d", dto);
	RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
	requestDispatcher.forward(req, res);
	
	}

}
