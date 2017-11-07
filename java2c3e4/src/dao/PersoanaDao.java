/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Persoana;
import javax.persistence.EntityManager;

public class PersoanaDao {
    private EntityManager em;

    public PersoanaDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaPersoana(Persoana persoana){
        em.persist(persoana);
    }
}
