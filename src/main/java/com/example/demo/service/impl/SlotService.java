package com.example.demo.service.impl;

import com.example.demo.model.Slot;
import com.example.demo.repository.ISlotRepository;
import com.example.demo.service.ISlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SlotService implements ISlotService {
    @Autowired
    ISlotRepository iSlotRepository ;

    @Override
    public List<Slot> getSlotChosen(Integer id) {
        return iSlotRepository.findSlotChosen(id);
    }
}
