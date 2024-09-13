package com.vt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vt.binding.Passenger;
import com.vt.binding.Ticket;
import com.vt.service.IxigoService;


@RestController
@RequestMapping("ixigo")
public class IxigoController {

	@Autowired
	private IxigoService ixigoService;
	
	@PostMapping("/bookTicket")
	public ResponseEntity<Ticket>bookTicket(@RequestBody Passenger passenger){
		Ticket ticket = ixigoService.bookTicket(passenger);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping("/getTicket/{id}")
	public ResponseEntity<Ticket> getTicket(@PathVariable("id")Integer ticketId){
		Ticket ticket = ixigoService.getTicket(ticketId);
		return ResponseEntity.ok(ticket);
	}
	
	@GetMapping("/getAllTickets")
	public ResponseEntity<List<Ticket>> getTicket(){
		 List<Ticket> allTicket = ixigoService.getAllTickets();
		return ResponseEntity.ok(allTicket);
	}
	
	@DeleteMapping("/deleteTickets/{id}")
	public ResponseEntity<String> deleteTicket(@PathVariable("id")Integer ticketId){
		 String deleteTicket = ixigoService.deleteTicket(ticketId);
		return ResponseEntity.ok(deleteTicket);
	}
	
	@DeleteMapping("/updateTickets/{id}")
	public ResponseEntity<Ticket> updateTicket(@RequestBody Passenger passenger,@PathVariable("id")Integer ticketId){
		  Ticket updateTicket = ixigoService.updateTicket(passenger,ticketId);
		return ResponseEntity.ok(updateTicket);
	}
}
