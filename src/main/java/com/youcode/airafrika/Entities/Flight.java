package com.youcode.airafrika.Entities;

import com.youcode.airafrika.Enums.Availability;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected Availability availability;
    @OneToMany
    protected List<Reservation> reservations;
    @OneToMany
    protected List<FlightPath> flightPaths;
    @ManyToOne
    protected Plane plane;
}
