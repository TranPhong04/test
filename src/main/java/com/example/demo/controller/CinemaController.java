package com.example.demo.controller;

import com.example.demo.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cinema")
public class CinemaController {
    @Autowired
    ICinemaService iCinemaService;
    @GetMapping("/listCinema")
    public ResponseEntity<?> getAllCinema(){
        return new ResponseEntity<>(iCinemaService.getAll(), HttpStatus.OK);
    }
}
