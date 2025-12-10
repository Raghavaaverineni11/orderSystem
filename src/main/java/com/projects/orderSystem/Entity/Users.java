package com.projects.orderSystem.Entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="")
@Data
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="Role")
    private String role;



}
