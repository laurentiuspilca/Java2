/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.CI;
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
                Persistence.createEntityManagerFactory("java2c4e2PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Persoana p = new Persoana();
        p.setNume("Ion Pop");
        
        CI ci = new CI();
        ci.setNumar(12345);
        ci.setSerie("AA");
        
        p.setCi(ci);
        ci.setPersoana(p);
        
        em.persist(p);
        em.getTransaction().commit();
    }
    
}
