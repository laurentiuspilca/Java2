/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import entities.Produs;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class ProdusService {
    private EntityManagerFactory emf;
   
    
    private ProdusService() {
        emf = Persistence.createEntityManagerFactory("java2c2e5PU");
    }
    
    private static final class SingletonHolder {
        private static final ProdusService SINGLETON = new ProdusService();
    }
    
    public static ProdusService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void creazaZeceProduse() {
        EntityManager em = emf.createEntityManager();
        ProdusDao dao = new ProdusDao(em);
        
        try {
            em.getTransaction().begin();
            for (int i=1 ;i<=10; i++) {
                Produs p = new Produs();
                p.setNume("PRODUS "+i);
                p.setPret(10);
                dao.adaugaProdus(p);
                //em.flush();
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    
    public void stergeProdus(Produs p) {
        EntityManager em = emf.createEntityManager();
        ProdusDao dao = new ProdusDao(em);
        
         try {
            em.getTransaction().begin();
            //p = em.merge(p);
            p = dao.getProdus(p.getId());
            if (p != null) {
                dao.stergeProdus(p);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public void modificaProdus(int id, String nume, double pret) {
        EntityManager em = emf.createEntityManager();
        ProdusDao dao = new ProdusDao(em);
        
        try {
            em.getTransaction().begin();
            Produs p = dao.getProdus(id);
            //em.detach(p);
            if (p != null) {
                p.setNume(nume);
                p.setPret(pret);
                //em.refresh(p);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public List<Produs> getAll() {
        EntityManager em = emf.createEntityManager();
        try {
            ProdusDao dao = new ProdusDao(em);
            return dao.getAllProducts();
        } finally {
            em.close();
        }
    }
    
}
