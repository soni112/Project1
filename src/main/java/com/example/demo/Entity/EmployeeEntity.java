package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeController")
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
