/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Curs;
import entities.Profesor;
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
                Persistence.createEntityManagerFactory("java2c4e3PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Profesor p = new Profesor();
        p.setNume("Profesor 1");
        
        Curs c1 = new Curs();
        c1.setNume("Curs 1");
        
        Curs c2 = new Curs();
        c2.setNume("Curs 2");
        
        p.getCursuri().add(c1);
        c1.setProfesor(p);
        
        p.getCursuri().add(c2);
        c2.setProfesor(p);
        
        em.persist(p);
        p.getCursuri().forEach(em::persist);
        
        em.getTransaction().commit();
    }
    
}
