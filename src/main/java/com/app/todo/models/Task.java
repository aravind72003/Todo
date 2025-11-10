package com.app.todo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity //used to tell JPA provider that a plain java class represents a database table
@Data //significantly reduces boilerplate code in java classes, it is a shortcut to several other Lombok annotations
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean completed;
}
