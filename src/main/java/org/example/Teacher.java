package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String FirstName;

    private String LastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
    List<Subject> subjects;

    @OneToOne(cascade = CascadeType.ALL)
    Klasa klasa;

    public Teacher(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public Teacher(){

    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }
}
