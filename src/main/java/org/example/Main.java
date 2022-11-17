package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ZI2-Zad6");
        EntityManager em = emf.createEntityManager();

        // Klasy
        Klasa c = new Klasa();
        c.setName("IIA");
        c.setLevel(2);
        c.setStudents(new ArrayList<>());
        c.setSubjects(new ArrayList<>());

        Klasa c2 = new Klasa();
        c2.setName("IIIB");
        c2.setLevel(3);
        c2.setStudents(new ArrayList<>());
        c2.setSubjects(new ArrayList<>());


        // Nauczyciele
        Teacher t1 = new Teacher("Lord", "Sauron");
        t1.setSubjects(new ArrayList<>());
        Teacher t2 = new Teacher("Elrond", "Peredhel");
        t2.setSubjects(new ArrayList<>());
        Teacher t3 = new Teacher("Gandalf", "The White");
        t3.setSubjects(new ArrayList<>());
        c.setTeacher(t1);
        t1.setKlasa(c);
        c2.setTeacher(t3);
        t3.setKlasa(c2);


        // Uczniowie
        Student s1 = new Student("Marcel", "Grycki");
        s1.setKlasa(c);
        c.getStudents().add(s1);
        Student s2 = new Student("Jakub", "Tokarczyk");
        s2.setKlasa(c);
        c.getStudents().add(s2);
        Student s3 = new Student("Mikolaj", "Jozwik");
        s3.setKlasa(c);
        c.getStudents().add(s3);
        Student s4 = new Student("Sebastian", "Wozniak");
        s4.setKlasa(c);
        c.getStudents().add(s4);
        Student s5 = new Student("Michal", "Antoszczyszyn");
        s5.setKlasa(c2);
        c2.getStudents().add(s5);
        Student s6 = new Student("Alith", "Anar");
        s6.setKlasa(c2);
        c2.getStudents().add(s6);
        Student s7 = new Student("Maciej", "Olszewski");
        s7.setKlasa(c2);
        c2.getStudents().add(s7);
        Student s8 = new Student("Jimmy", "Raynor");
        s8.setKlasa(c2);
        c2.getStudents().add(s8);


        // Przedmioty
        Subject p1 = new Subject("Nekromancja");
        p1.setTeacher(t1);
        t1.getSubjects().add(p1);
        p1.setKlasa(c);
        c.getSubjects().add(p1);

        Subject p2 = new Subject("Techniki dominacji");
        p2.setTeacher(t1);
        t1.getSubjects().add(p2);
        p2.setKlasa(c);
        c.getSubjects().add(p2);

        Subject p3 = new Subject("Podstawy magii");
        p3.setTeacher(t3);
        t3.getSubjects().add(p3);
        p3.setKlasa(c2);
        c2.getSubjects().add(p3);

        Subject p4 = new Subject("Podstawy elfiej szermierki");
        p4.setTeacher(t2);
        t2.getSubjects().add(p4);
        p4.setKlasa(c2);
        c2.getSubjects().add(p4);

        Subject p5 = new Subject("Retoryka i manipulacja");
        p5.setTeacher(t1);
        t1.getSubjects().add(p5);
        p5.setKlasa(c);
        c.getSubjects().add(p5);

        Subject p6 = new Subject("Podstawy elfiej poezji");
        p6.setTeacher(t2);
        t2.getSubjects().add(p6);
        p6.setKlasa(c2);
        c2.getSubjects().add(p6);


        em.getTransaction().begin();
        em.persist(c);
        em.merge(c2);
        em.getTransaction().commit();
    }
}