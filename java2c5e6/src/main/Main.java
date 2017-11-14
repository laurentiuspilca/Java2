/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Adresa;
import entities.Persoana;
import java.util.HashMap;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c5e6PU");
    
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Persoana p = new Persoana();
        p.setNume("Gigel");
        
        Adresa a = new Adresa();
        a.setNumar(10);
        a.setStrada("Strada 1");
        a.setOras("Bucuresti");
        
        p.setAdrese(new HashMap<>());
        p.getAdrese().put("Home", a);
        
        a.setPersoana(p);
        
        em.persist(p);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
