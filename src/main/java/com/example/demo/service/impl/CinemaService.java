package com.example.demo.service.impl;

import com.example.demo.model.Cinema;
import com.example.demo.repository.ICinemaRepository;
import com.example.demo.service.ICinemaService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CinemaService implements ICinemaService {
    @Autowired
    ICinemaRepository iCinemaRepository;
    private static final Logger logger = LoggerFactory.getLogger(Exception.class);

    @Override
    public List<Cinema> getAll() {
        try {
            return (List<Cinema>) iCinemaRepository.findAll();
        }
        catch (Exception e) {
            logger.error("An exception occurred", e);
            return null;
        }
    };
}
