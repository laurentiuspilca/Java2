/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.CoffeeDao;
import db.Coffee;
import db.Size;
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
                Persistence.createEntityManagerFactory("java2c3e1PU");
        
        EntityManager em = emf.createEntityManager();
        CoffeeDao coffeeDao = new CoffeeDao(em);
        
        Coffee coffee = new Coffee();
        coffee.setDenumire("Mocha");
        coffee.setMarime(Size.MEDIUM);
        
        em.getTransaction().begin();
        coffeeDao.addCoffee(coffee);
        em.getTransaction().commit();
        
    }
    
}
