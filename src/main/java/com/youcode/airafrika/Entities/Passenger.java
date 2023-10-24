package com.youcode.airafrika.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Passenger extends User {
    @OneToMany
    protected List<Reservation> reservations;
}
