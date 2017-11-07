/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.AngajatDao;
import dao.ProdusDao;
import db.Angajat;
import db.Produs;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class MainService {
    private EntityManagerFactory emf;
    
    private AngajatDao angajatDao;
    private ProdusDao produsDao;
    
    
    
    private MainService(){
        emf = Persistence.createEntityManagerFactory("java2c3e3PU");
    }
    
    private static final class SINGLETON_HOLDER{
        private static final MainService INSTANCE = new MainService();
    }
    
    public static MainService getInstance(){
        return SINGLETON_HOLDER.INSTANCE;
    }
    
    public void adaugaAngajat(Angajat angajat){
        EntityManager em = emf.createEntityManager();
        angajatDao = new AngajatDao(em);
        em.getTransaction().begin();
        angajatDao.adaugaAngajat(angajat);
        em.getTransaction().commit();
    }
    
    
     public void adaugaProdus(Produs produs){
        EntityManager em = emf.createEntityManager();
        produsDao = new ProdusDao(em);
        em.getTransaction().begin();
        produsDao.adaugaProdus(produs);
        em.getTransaction().commit();
    }
}
