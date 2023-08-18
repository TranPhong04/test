package com.example.demo.repository;

import com.example.demo.model.Cinema;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICinemaRepository extends PagingAndSortingRepository<Cinema,Long> {
}
