package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CinemaFilms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

}
