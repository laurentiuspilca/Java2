/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.FilmDao;
import db.Film;
import static java.sql.Date.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class Main {

    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c3e2PU");
       EntityManager em = emf.createEntityManager();
       FilmDao filmDao = new FilmDao(em);
        
       Film film1 = new Film();
       film1.setTitlu("Thor: Ragnarok");
       film1.setDataAparitie(valueOf(LocalDate.now()));
       
       Film film2 = new Film();
       film2.setTitlu("Arrival");
       film2.setDataAparitie(new Date(System.currentTimeMillis()));
       
       
       em.getTransaction().begin();
       filmDao.adaugaFilm(film1);
       filmDao.adaugaFilm(film2);
       em.getTransaction().commit();
       
       List<Film> listaFilme = filmDao.getFilme();
       listaFilme.forEach(System.out::println);
        
    }
    
}
