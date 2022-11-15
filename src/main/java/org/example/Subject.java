package org.example;

import jakarta.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Name;

    @ManyToOne(cascade = CascadeType.ALL)
    Teacher teacher;


}
