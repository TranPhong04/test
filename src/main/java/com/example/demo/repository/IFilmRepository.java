package com.example.demo.repository;

import com.example.demo.model.Film;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFilmRepository extends PagingAndSortingRepository<Film,Long> {
    @Query(nativeQuery = true, value = "SELECT \n" +
            "    f.id AS film_id,\n" +
            "    f.title AS film_title,\n" +
            "    f.release_date AS film_release_date,\n" +
            "    f.duration AS film_duration,\n" +
            "    f.genre AS film_genre,\n" +
            "    c.id AS cinema_id,\n" +
            "    c.name AS cinema_name\n" +
            "FROM \n" +
            "    films AS f\n" +
            "JOIN \n" +
            "    cinema_films AS cf ON f.id = cf.film_id\n" +
            "JOIN \n" +
            "    cinema AS c ON cf.cinema_id = c.id\n" +
            "WHERE \n" +
            "    cf.cinema_id = ?;\n")
    List<Object[]> getAllFilmOfCinema(Long id);
    @Query(nativeQuery = true, value = "SELECT \n" +
            "    f.id AS film_id,\n" +
            "    f.title AS film_title,\n" +
            "    f.release_date AS film_release_date,\n" +
            "    f.duration AS film_duration,\n" +
            "    f.genre AS film_genre,\n" +
            "    fd.price AS film_price\n" +
            "FROM \n" +
            "    films AS f\n" +
            "JOIN \n" +
            "    film_detail AS fd ON f.id_detail = fd.id;\n")
    List<Object[]> getAllDetailFilm();
    @Query(nativeQuery = true, value = "SELECT " +
            "    f.id AS film_id, " +
            "    f.title AS film_title, " +
            "    f.release_date AS film_release_date, " +
            "    f.duration AS film_duration, " +
            "    f.genre AS film_genre, " +
            "    fd.price AS film_price " +
            "FROM " +
            "    films AS f " +
            "JOIN " +
            "    film_detail AS fd ON f.id_detail = fd.id " +
            "WHERE " +
            "    f.id = :id")
    List<Object[]> getFilmAndDetailById(@Param("id") Integer filmId);
}

