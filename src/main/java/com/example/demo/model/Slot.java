package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Slot {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "slot_number")
    private Integer slotNumber;

    @Column(name = "status_slot")
    private Boolean statusSlot;
}
