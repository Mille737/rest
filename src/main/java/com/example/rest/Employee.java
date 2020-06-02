package com.example.rest;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data // creates all getters, setters, toString ect.
@Entity // makes the object ready for JPA storage
public class Employee {

    private @Id @GeneratedValue Long id; //indicates the primary key and auto generated
    private String name;
    private String firstName;
    private String lastName;
    private String role;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String name) {
        String[] parts =name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }
}
