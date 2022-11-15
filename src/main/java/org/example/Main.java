package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ZI2-Zad6");
        EntityManager em = emf.createEntityManager();

        Klasa c = new Klasa();
        c.setName("IIA");
        c.setLevel(2);
        c.setStudents(new ArrayList<>());

        Student s1 = new Student("Marcel", "Grycki");
        Student s2 = new Student("Jakub", "Tokarczyk");

        c.getStudents().add(s1);
        c.getStudents().add(s2);

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
}