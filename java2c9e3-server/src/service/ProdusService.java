/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Produs;

/**
 *
 * @author student
 */
public class ProdusService {
    private EntityManagerFactory emf;
    
    private ProdusService() {
        emf = Persistence.createEntityManagerFactory("java2c9e3-serverPU");
    }
    
    private static final class SingletonHolder {
        private static final ProdusService SINGLETON = new ProdusService();
    }
    
    public static ProdusService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaProdus(Produs p) {
        EntityManager em = emf.createEntityManager();
        try {
            ProdusDao produsDao = new ProdusDao(em);
            em.getTransaction().begin();
            produsDao.adaugaProdus(p);
            em.getTransaction().commit();
        }  finally {
            em.close();
        }
    }
    
    public List<Produs> getProduse() {
        EntityManager em = emf.createEntityManager();
        try {
            ProdusDao produsDao = new ProdusDao(em);
            return produsDao.getProduse();
        } finally {
            em.close();
        }
    }
    
    public void stergeProdus (Produs p) {
        EntityManager em = emf.createEntityManager();
        try {
            ProdusDao produsDao = new ProdusDao(em);
            em.getTransaction().begin();
            produsDao.stergeProdus(p);
            em.getTransaction().commit();
        }  finally {
            em.close();
        }
    }
}
