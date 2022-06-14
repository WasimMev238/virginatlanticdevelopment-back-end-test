package com.flight.flightdisplay;

import java.util.List;

import package com.flight.flightdisplay.domain.entity.Flight;

public interface FlightService {
	
	Flight getFlightById(String flightId);

	List<Flight> getAllFlights();
}
