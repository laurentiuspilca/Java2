/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Persoana;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
        String sql = "SELECT * FROM persoana";
        Query query = em.createNativeQuery(sql, Persoana.class);
        return query.getResultList();
    }
}
