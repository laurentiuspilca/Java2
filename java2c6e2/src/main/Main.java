/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.MasinaDao;
import dao.PersoanaDao;
import entities.Masina;
import entities.Persoana;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c6e2PU");
        
        EntityManager em = emf.createEntityManager();
        
        PersoanaDao persoanaDao = new PersoanaDao(em);
        MasinaDao masinaDao = new MasinaDao(em);
        
        Persoana p1 = new Persoana();
        p1.setNume("Persoana 1");
        p1.setMasini(new ArrayList<>());
        
        Masina m1 = new Masina();
        m1.setMarca("BMW");
        m1.setCuloare("negru");
        m1.setPersoana(p1);
        p1.getMasini().add(m1);
        
        Masina m2 = new Masina();
        m2.setMarca("Dacia");
        m2.setCuloare("verde");
        m2.setPersoana(p1);
        p1.getMasini().add(m2);
        
        Masina m3 = new Masina();
        m3.setMarca("Dacia");
        m3.setCuloare("negru");
        m3.setPersoana(p1);
        p1.getMasini().add(m3);
        
        Persoana p2 = new Persoana();
        p2.setNume("Persoana 2");
        p2.setMasini(new ArrayList<>());
        
        Masina m4 = new Masina();
        m4.setMarca("BMW");
        m4.setCuloare("verde");
        m4.setPersoana(p2);
        p2.getMasini().add(m4);
        
        Masina m5 = new Masina();
        m5.setMarca("BMW");
        m5.setCuloare("alb");
        m5.setPersoana(p2);
        p2.getMasini().add(m5);
        
        em.getTransaction().begin();
        persoanaDao.addPersoana(p1);
        persoanaDao.addPersoana(p2);
        
        //persoanaDao.getAll().forEach(System.out::println);
        //masinaDao.findByCuloare("verde").forEach(System.out::println);
        //masinaDao.findMasiniForPersoana(p2).forEach(System.out::println);
        
        em.getTransaction().commit();
        
        masinaDao.findMasiniForPersoanaWithMarca(p1.getId(), "BMW").forEach(System.out::println);
        //masinaDao.findMasiniForPersoana(p1.getId()).forEach(System.out::println);
    }
    
}
