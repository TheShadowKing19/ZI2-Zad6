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

    @ManyToOne(cascade = CascadeType.ALL)
    Klasa klasa;

    public Subject(String name) {
        Name = name;
    }

    public Subject(){

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }
}
