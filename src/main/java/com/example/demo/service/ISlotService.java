package com.example.demo.service;

import com.example.demo.model.Slot;

import java.util.List;

public interface ISlotService {
    List<Slot> getSlotChosen(Integer id);
}
