package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserDetail {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "role_user")
    private Integer userRole;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserAccount userAccount;
}
