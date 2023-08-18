package com.example.demo.controller;

import com.example.demo.service.ISlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@CrossOrigin(origins = "*")
public class SlotController {
    @Autowired
    ISlotService iSlotService;
    @GetMapping("/slots/{id}")
    public ResponseEntity<?> getAllSlotChosen(@PathVariable("id") Integer id){
        return new ResponseEntity<>(iSlotService.getSlotChosen(id), HttpStatus.OK);
    }
}
