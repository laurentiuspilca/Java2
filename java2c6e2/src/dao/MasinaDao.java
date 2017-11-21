/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Masina;
import entities.Persoana;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author student
 */
public class MasinaDao {
    
    private EntityManager em;
    
    public MasinaDao(EntityManager em) {
        this.em = em;
    }
    
    public List<Masina> findByCuloare(String culoare) {
        String sql = "SELECT m FROM Masina m WHERE m.culoare = :culoare";
        TypedQuery<Masina> query = em.createQuery(sql, Masina.class);
        query.setParameter("culoare", culoare);
        return query.getResultList();
    }
    
    public List<Masina> findMasiniForPersoana(Persoana p) {
        String sql = "SELECT m FROM Masina m WHERE m.persoana = :persoana";
        TypedQuery<Masina> query = em.createQuery(sql, Masina.class);
        query.setParameter("persoana", p);
        return query.getResultList();
    }
    
    public List<Masina> findMasiniForPersoana(int idPersoana) {
        String sql = "SELECT m FROM Masina m WHERE m.persoana.id = :idPersoana";
        TypedQuery<Masina> query = em.createQuery(sql, Masina.class);
        query.setParameter("idPersoana", idPersoana);
        return query.getResultList();
    }
    
    public List<Masina> findMasiniForPersoanaWithMarca(int idPersoana, String marca) {
        String sql = "SELECT m FROM Masina m WHERE m.persoana.id = :idPersoana AND m.marca = :marca";
        TypedQuery<Masina> query = em.createQuery(sql, Masina.class);
        query.setParameter("idPersoana", idPersoana);
        query.setParameter("marca", marca);
        return query.getResultList();
    }
}
