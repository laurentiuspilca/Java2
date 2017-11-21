/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.PersoanaDao;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c6e3PU");
        
        EntityManager em = emf.createEntityManager();
        PersoanaDao persoanaDao = new PersoanaDao(em);

        persoanaDao.findAll().forEach(System.out::println);
        
        em.close();
        emf.close();
    }
    
}
