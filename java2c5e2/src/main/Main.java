/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Adresa;
import entities.Student;
import java.util.Arrays;
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
                Persistence.createEntityManagerFactory("java2c5e2PU");
    
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Student s = new Student();
        s.setNume("Gigel");
        
        Adresa a1 = new Adresa();
        a1.setNumar(10);
        a1.setStrada("Strada 1");
        a1.setOras("Bucuresti");
        
        Adresa a2 = new Adresa();
        a2.setNumar(6);
        a2.setStrada("Strada 2");
        a2.setOras("Constanta");
        
        s.setAdrese(Arrays.asList(a1,a2));
        
        em.persist(s);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
