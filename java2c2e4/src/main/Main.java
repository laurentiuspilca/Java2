/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Persoana;
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
                Persistence.createEntityManagerFactory("java2c2e4PU");
        
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            Persoana p = new Persoana();
            p.setId(10);
            p.setNume("Ion Pop");
            em.persist(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
}
