package com.vt.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vt.binding.Passenger;
import com.vt.binding.Ticket;

@Service
public class IxigoService implements IxigoServiceInterface {

	private RestTemplate restTemplate;

	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public Ticket bookTicket(Passenger passenger) {
		String url="http://localhost:8017/bookTicket;"
				restTemplate.postForEntity(url.assanger
		return null;
	}

	@Override
	public Ticket getTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket updateTicket(Passenger passenger, Integer ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

