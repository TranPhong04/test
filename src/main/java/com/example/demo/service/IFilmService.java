package com.example.demo.service;

import com.example.demo.model.Film;
import com.example.demo.model.dto.CinemaFilmDTO;
import com.example.demo.model.dto.FilmDetailDTO;

import java.util.List;

public interface IFilmService {
    List<CinemaFilmDTO> getAllFilmOfCinema(Long id);
    List<FilmDetailDTO> getAllDetailFilm();
    List<FilmDetailDTO> getFilmAndDetailById(Integer id);

}
