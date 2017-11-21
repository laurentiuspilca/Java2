/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Produs;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author student
 */
public class ProdusDao {
    
    private EntityManager em;
    
    public ProdusDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaProdus(Produs p) {
        em.persist(p);
    }
    
    public List<Produs> findAll() {
        String sql = "SELECT p FROM Produs p";
        TypedQuery<Produs> query = em.createQuery(sql, Produs.class);
        return query.getResultList();
    }
    
    public List<Produs> findWithPriceGreaterThan(double price) {
        String sql = "SELECT p FROM Produs p WHERE p.pret > :abc";
        TypedQuery<Produs> query = em.createQuery(sql, Produs.class);
        query.setParameter("abc", price);
        return query.getResultList();
    }
    
    public List<Produs> findWithNameLike(String name) {
        String sql = "SELECT p FROM Produs p WHERE p.nume LIKE :nume";
        TypedQuery<Produs> query = em.createQuery(sql, Produs.class);
        query.setParameter("nume", "%"+name+"%");
        return query.getResultList();
    }
    
    public List<Produs> findWithPriceBetween(double min, double max) {
        //String sql = "SELECT p FROM Produs p WHERE p.pret >= :min AND p.pret <= :max";
        String sql = "SELECT p FROM Produs p WHERE p.pret BETWEEN :min AND :max";
        TypedQuery<Produs> query = em.createQuery(sql, Produs.class);
        query.setParameter("min", min);
        query.setParameter("max", max);
        return query.getResultList();
    }
}
