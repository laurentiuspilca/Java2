/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Angajat;
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
                Persistence.createEntityManagerFactory("java2c5e10PU");
    
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Angajat a = new Angajat();
        a.setNume("Pop");
        a.setPrenume("Ion");
        a.setSalariu(1000);
        
        em.persist(a);
        
        em.getTransaction().commit();
        
        em.close();
    }
    
}
