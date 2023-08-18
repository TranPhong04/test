package com.example.demo.model.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class FilmDetailDTO {
    private Integer filmId;
    private String filmTitle;
    private Date filmReleaseDate;
    private Integer filmDuration;
    private String filmGenre;
    private BigDecimal filmPrice;

    public FilmDetailDTO() {
    }

    public FilmDetailDTO(Integer filmId, String filmTitle, Date filmReleaseDate, Integer filmDuration, String filmGenre, BigDecimal filmPrice) {
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.filmReleaseDate = filmReleaseDate;
        this.filmDuration = filmDuration;
        this.filmGenre = filmGenre;
        this.filmPrice = filmPrice;

    }

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

    public void setFilmDuration(int filmDuration) {
        this.filmDuration = filmDuration;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public BigDecimal getFilmPrice() {
        return filmPrice;
    }

    public void setFilmPrice(BigDecimal filmPrice) {
        this.filmPrice = filmPrice;
    }


}
