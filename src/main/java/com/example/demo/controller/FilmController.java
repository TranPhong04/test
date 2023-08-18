package com.example.demo.controller;

import com.example.demo.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@CrossOrigin(origins = "*")
@RequestMapping()
public class FilmController {
    @Autowired
    IFilmService iFilmService;
    @GetMapping("/films/cinema/{id}")
    public ResponseEntity<?> getAllFilmOfCinema(@PathVariable(name = "id") Long id){
        return new ResponseEntity<>(iFilmService.getAllFilmOfCinema(id), HttpStatus.OK);
    }
    @GetMapping("/films")
    public ResponseEntity<?> getAllFilm(){
        return new ResponseEntity<>(iFilmService.getAllDetailFilm(), HttpStatus.OK);
    }
    @GetMapping("/film/{id}")
    public ResponseEntity<?> getDetailFilm(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(iFilmService.getFilmAndDetailById(id), HttpStatus.OK);
    }
}
