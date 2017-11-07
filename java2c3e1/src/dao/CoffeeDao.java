package dao;

import db.Coffee;
import javax.persistence.EntityManager;

public class CoffeeDao {
    private EntityManager em;
    
    public CoffeeDao(EntityManager em){
        this.em = em;
    }
    
    public void addCoffee(Coffee coffee){
        em.persist(coffee);
    }
}
