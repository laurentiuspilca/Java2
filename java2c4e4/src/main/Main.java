/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Profesor;
import entities.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("java2c4e4PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Profesor p1 = new Profesor();
        p1.setNume("Profesor 1");
        
        Profesor p2 = new Profesor();
        p2.setNume("Profesor 2");
        
        Student s1 = new Student();
        s1.setNume("Student 1");
        
        Student s2 = new Student();
        s2.setNume("Student 2");
        
        s1.getProfesori().add(p1);
        
        s2.getProfesori().add(p1);
        s2.getProfesori().add(p2);
        
        p1.getStudenti().add(s1);
        p1.getStudenti().add(s2);
        
        p2.getStudenti().add(s2);
        
        em.persist(s1);
        em.persist(s2);
        
        em.getTransaction().commit();
    }
    
}
