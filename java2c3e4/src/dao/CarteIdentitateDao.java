/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.CarteIdentitate;
import javax.persistence.EntityManager;

public class CarteIdentitateDao {
    private EntityManager em;

    public CarteIdentitateDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaCarteIdentitate(CarteIdentitate carteIdentitate){
        em.persist(carteIdentitate);
    }
}
