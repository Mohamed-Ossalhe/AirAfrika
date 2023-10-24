package com.youcode.airafrika.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @ManyToOne
    protected Passenger passenger;
    @ManyToOne
    protected Flight flight;
    @OneToMany
    protected List<Companion> companions;
    protected double price;
}
