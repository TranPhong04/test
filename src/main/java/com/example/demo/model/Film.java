package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "genre")
    private String genre;

    @OneToOne
    @JoinColumn(name = "id_detail")
    private FilmDetail detail;



}
