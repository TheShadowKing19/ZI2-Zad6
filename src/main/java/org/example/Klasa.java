package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Klasa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Name;

    private int Level;

    @OneToMany(cascade = CascadeType.ALL)
    List<Student> students;

    @OneToOne(cascade = CascadeType.ALL)
    Teacher teacher;

    @OneToMany(cascade = CascadeType.ALL)
    List<Subject> subjects;

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
