/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Persoana;
import java.util.ArrayList;
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
                Persistence.createEntityManagerFactory("java2c4e6PU");
        
        EntityManager em = emf.createEntityManager();
        
        Persoana p = new Persoana();
        p.setNume("Gigel");
        
        p.setTelefoane(new ArrayList<>());
        p.getTelefoane().add("0721111111");
        p.getTelefoane().add("0725555555");
        p.getTelefoane().add("0728888888");
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
}
