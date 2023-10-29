package com.youcode.airafrika.Entities;

import com.youcode.airafrika.Enums.Availability;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "availability")
    protected Availability availability;
    @OneToMany(mappedBy = "flight")
    protected List<Reservation> reservations;
    @OneToMany(mappedBy = "flight")
    protected List<FlightPath> flightPaths;
    @ManyToOne
    @JoinColumn(name = "plane_id")
    protected Plane plane;
}
