package com.example.demo.repository;

import com.example.demo.model.Slot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISlotRepository extends PagingAndSortingRepository<Slot,Long> {
        @Query(nativeQuery = true, value = "SELECT * FROM slot WHERE slot_number=:id")
        List<Slot> findSlotChosen(@Param("id") Integer id);
}
