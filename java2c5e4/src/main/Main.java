/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Persoana;
import entities.Tip;
import java.util.Date;
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
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("java2c5e4PU");
    
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Persoana p = new Persoana();
        p.setNume("Gigel");
        p.setTelefoane(new HashMap<>());
        p.getTelefoane().put(Tip.WORK, "072111111");
        p.getTelefoane().put(Tip.MOBILE, "072333333");
        
        em.persist(p);
        
        
        em.getTransaction().commit();
        em.close();
    }
    
}
