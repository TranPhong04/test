package com.example.demo.service.impl;

import com.example.demo.model.Film;
import com.example.demo.model.dto.CinemaFilmDTO;
import com.example.demo.model.dto.FilmDetailDTO;
import com.example.demo.repository.IFilmRepository;
import com.example.demo.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class FilmService implements IFilmService {
    @Autowired
    IFilmRepository iFilmRepository;
    @Override
    public List<CinemaFilmDTO> getAllFilmOfCinema(Long cinemaId) {
        List<Object[]> results = iFilmRepository.getAllFilmOfCinema(cinemaId);
        List<CinemaFilmDTO> cinemaFilmDTOs = new ArrayList<>();

        for (Object[] result : results) {
            CinemaFilmDTO dto = new CinemaFilmDTO();
            dto.setFilmId((Integer) result[0]);
            dto.setFilmTitle((String) result[1]);
            dto.setFilmReleaseDate((Date) result[2]);
            dto.setFilmDuration((Integer) result[3]);
            dto.setFilmGenre((String) result[4]);
            dto.setCinemaId((Integer) result[5]);
            dto.setCinemaName((String) result[6]);
            cinemaFilmDTOs.add(dto);
        }

        return cinemaFilmDTOs;
    }

    @Override
    public List<FilmDetailDTO> getAllDetailFilm() {
        List<Object[]> results = iFilmRepository.getAllDetailFilm();
        List<FilmDetailDTO> filmDTOs = new ArrayList<>();

        for (Object[] result : results) {
            FilmDetailDTO dto = new FilmDetailDTO();
            dto.setFilmId((Integer) result[0]);
            dto.setFilmTitle((String) result[1]);
            dto.setFilmReleaseDate((Date) result[2]);
            dto.setFilmDuration((Integer) result[3]);
            dto.setFilmGenre((String) result[4]);
            dto.setFilmPrice((BigDecimal) result[5]);
            filmDTOs.add(dto);
        }

        return filmDTOs;
    }

    @Override
    public List<FilmDetailDTO> getFilmAndDetailById(Integer id) {
        List<Object[]> results = iFilmRepository.getFilmAndDetailById(id);

        List<FilmDetailDTO> filmDTOs = new ArrayList<>();

        for (Object[] result : results) {
            FilmDetailDTO dto = new FilmDetailDTO();
            dto.setFilmId((Integer) result[0]);
            dto.setFilmTitle((String) result[1]);
            dto.setFilmReleaseDate((Date) result[2]);
            dto.setFilmDuration((Integer) result[3]);
            dto.setFilmGenre((String) result[4]);
            dto.setFilmPrice((BigDecimal) result[5]);
            filmDTOs.add(dto);
        }

        return filmDTOs;

    }
}
