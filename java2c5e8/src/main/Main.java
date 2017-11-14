/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.NrAuto;
import entities.Vehicul;
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
                Persistence.createEntityManagerFactory("java2c5e8PU");
    
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Vehicul v = new Vehicul();
        v.setNumar(new NrAuto());
        v.getNumar().setJudet("B");
        v.getNumar().setNumar(10);
        v.getNumar().setCod("XYZ");
        
        v.setCuloare("negru");
        
        em.persist(v);
        
        em.getTransaction().commit();
    }
    
}
