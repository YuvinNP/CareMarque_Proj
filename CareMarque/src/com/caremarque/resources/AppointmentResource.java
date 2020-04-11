package com.caremarque.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.caremarque.model.Appointment;
import com.caremarque.service.appointment.AppointmentService;

@Path("/Appointment")
public class AppointmentResource {
	
	AppointmentService as = new AppointmentService();
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String createAppointment() {
		Appointment appointment = new Appointment();
		
		return as.createAppointment(appointment);
		
	}
		
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAppointments() {
		// TODO Auto-generated constructor stub
		return "Appointment Resource Called...!";
	}
	

}
