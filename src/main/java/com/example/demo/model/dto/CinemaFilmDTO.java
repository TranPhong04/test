package com.example.demo.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


public class CinemaFilmDTO implements Serializable {
    private Integer filmId;
    private String filmTitle;
    private Date filmReleaseDate;
    private Integer filmDuration;
    private String filmGenre;
    private Integer cinemaId;
    private String cinemaName;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public Date getFilmReleaseDate() {
        return filmReleaseDate;
    }

    public void setFilmReleaseDate(Date filmReleaseDate) {
        this.filmReleaseDate = filmReleaseDate;
    }

    public Integer getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(Integer filmDuration) {
        this.filmDuration = filmDuration;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public CinemaFilmDTO() {
    }

    public CinemaFilmDTO(Integer filmId, String filmTitle, Date filmReleaseDate, Integer filmDuration, String filmGenre, Integer cinemaId, String cinemaName) {
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.filmReleaseDate = filmReleaseDate;
        this.filmDuration = filmDuration;
        this.filmGenre = filmGenre;
        this.cinemaId = cinemaId;
        this.cinemaName = cinemaName;
    }
}
