package com.youcode.airafrika.Entities;

import com.youcode.airafrika.Enums.ClassType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class FlightPath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected LocalDate departureDate;
    protected LocalDate arrivalDate;
    @ManyToOne
    protected Airport departureAirport;
    @ManyToOne
    protected Airport arriveAirport;
    @ManyToOne
    protected Flight flight;
    protected ClassType classType;
    @OneToMany
    protected List<StopOver> stopOvers;
}
