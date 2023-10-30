package com.youcode.airafrika.Services;

import com.youcode.airafrika.Dao.FlightDao;
import com.youcode.airafrika.Entities.Flight;

import java.util.List;

public class FlightService {
    private FlightDao flightDao;

    public FlightService() {flightDao = new FlightDao();}

    public List<Flight> getAllFlights() throws Exception {
        return flightDao.getAll();
    }

    public Flight createFlight(Flight flight) throws Exception {
        if (flight == null)
            throw new Exception("Flight Cannot be Null");
        else
            return flightDao.store(flight).get();
    }
}
