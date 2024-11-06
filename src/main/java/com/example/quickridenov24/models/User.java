package com.example.quickridenov24.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class User extends BaseModel {
    private String name;
    private String email;
    private String password;
    private double rating;
    private UserType userType;
}
