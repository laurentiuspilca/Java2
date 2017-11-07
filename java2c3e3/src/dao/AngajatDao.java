/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Angajat;
import javax.persistence.EntityManager;

/**
 *
 * @author student
 */
public class AngajatDao {
    private EntityManager em;
    
    public AngajatDao(EntityManager em){
        this.em = em;
    }
    
    public void adaugaAngajat(Angajat angajat){
        em.persist(angajat);
    }
}




