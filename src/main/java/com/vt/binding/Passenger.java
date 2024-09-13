package com.vt.binding;



import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
	private String name;
	@JsonFormat(pattern="dd-MM-yyyy")
	 
	private String JournerDate;
	private  Integer trainNumber;
	private String source;
	private String destination;

}
