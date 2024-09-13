package com.vt.binding;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Ticket {
	private String ticketId;

	private String name;

	private String source;

	private String destination;

	@JsonFormat(pattern = "dd-MM-yyyy")

	private LocalDate journeyDate;

	private Long trainNumber;

	private String pnr;

	private String ticketStatus;

}
