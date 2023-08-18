package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass_word")
    private String password;

}
