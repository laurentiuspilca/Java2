/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Produs;

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
    
    public List<Produs> getProduse () {
        String sql = "SELECT p FROM Produs p";
        TypedQuery<Produs> query = em.createQuery(sql, Produs.class);
        return query.getResultList();
    }
    
    public void stergeProdus(Produs p) {
        p = em.find(Produs.class, p.getId());
        em.remove(p);
    }
}
