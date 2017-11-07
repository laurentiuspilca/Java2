/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CarteIdentitateDao;
import dao.PersoanaDao;
import db.CarteIdentitate;
import db.Persoana;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainService {

    private EntityManagerFactory emf;

    private PersoanaDao persoanaDao;
    private CarteIdentitateDao carteIdentitateDao;

    private MainService() {
        emf = Persistence.createEntityManagerFactory("java2c3e4PU");
    }

    private static final class SINGLETON_HOLDER {

        private static final MainService INSTANCE = new MainService();
    }

    public static MainService getInstance() {
        return SINGLETON_HOLDER.INSTANCE;
    }
//
//    public void adaugaPersoana(Persoana persoana) {
//        EntityManager em = emf.createEntityManager();
//        persoanaDao = new PersoanaDao(em);
//        em.getTransaction().begin();
//        persoanaDao.adaugaPersoana(persoana);
//        em.getTransaction().commit();
//    }

    public void adaugaCarteIdentitate(CarteIdentitate carteIdentitate) {
        EntityManager em = emf.createEntityManager();
        carteIdentitateDao = new CarteIdentitateDao(em);
        em.getTransaction().begin();
        carteIdentitateDao.adaugaCarteIdentitate(carteIdentitate);
        em.getTransaction().commit();
    }
}
