package com.vt.service;

import java.util.List;

import com.vt.binding.Passenger;
import com.vt.binding.Ticket;

public interface IxigoServiceInterface {

	Ticket bookTicket(Passenger passenger);

	Ticket getTicket(Integer ticketId);

	List<Ticket> getAllTickets();

	String deleteTicket(Integer ticketId);

	Ticket updateTicket(Passenger passenger, Integer ticketId);

}
