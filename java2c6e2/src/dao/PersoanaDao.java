/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Persoana;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author student
 */
public class PersoanaDao {
    
    private EntityManager em;
    
    public PersoanaDao(EntityManager em) {
        this.em = em;
    }
    
    public void addPersoana(Persoana p) {
        em.persist(p);
    }
    
    public List<Persoana> getAll() {
        String sql = "SELECT p FROM Persoana p";
        TypedQuery<Persoana> query = em.createQuery(sql, Persoana.class);
        return query.getResultList();
    }
}
