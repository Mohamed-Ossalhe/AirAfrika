package com.youcode.airafrika.Entities;

import com.youcode.airafrika.Enums.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected Integer seatsCount;
    protected Model model;
    protected LocalDate constructionDate;
    @ManyToOne
    protected Company company;
    @OneToMany
    protected List<Seat> seats;
}
