/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Persoana;
import entities.Persoana_;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author student
 */
public class PersoanaDao {
    
    private EntityManager em;
    
    public PersoanaDao(EntityManager em) {
        this.em = em;
    }
    
    public List<Persoana> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Persoana> cq = cb.createQuery(Persoana.class);
        Root<Persoana> root = cq.from(Persoana.class);
        
        cq.select(root);
        TypedQuery<Persoana> query = em.createQuery(cq);
        return query.getResultList();
    }
    
    public List<Persoana> findByNume(String nume) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Persoana> cq = cb.createQuery(Persoana.class);
        
        Root<Persoana> root = cq.from(Persoana.class);
        
        cq.select(root);
        
        cq.where(cb.equal(root.get(Persoana_.nume), nume));
        
        TypedQuery<Persoana> query = em.createQuery(cq);
        return query.getResultList();
    }
}
