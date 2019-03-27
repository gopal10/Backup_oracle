package com.stackroute.registration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class UserRegistation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id ;
    @Column(name="firstName")
    private String firstName ;
    @Column(name="lastName")
    private String lastName;
    @Column(name="password")
    private String password;
    @Column(name="confirmPassword")
    private String confirmPassword;
    @Column(name="email")
    private String email;
    @Column(name="phoneNumber")
    private long phoneNumber;
    @Column(name = "role")
    private String role;
}
