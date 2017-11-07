/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Masina;
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
                Persistence.createEntityManagerFactory("java2c4e1PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Masina m = new Masina();
        m.setMarca("Audi");
        em.persist(m);
        em.getTransaction().commit();
    }
    
}
