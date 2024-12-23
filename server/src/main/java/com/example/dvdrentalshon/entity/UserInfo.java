package com.example.dvdrentalshon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private String roles;
    private boolean age;
    private int borrowed;
    private int rented;


    public UserInfo(String name, String email, String password, String roles, boolean age){
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.age = age;
    }
    @Override
    public String toString() {
        return  "\"name\": "
                + "\"" + this.name + "\""
                + ", \"role\": "
                + "\"" + this.roles + "\""
                + ", \"age\": "
                + "\"" + this.age + "\"";
    }
}

