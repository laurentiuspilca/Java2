/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Film;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author student
 */
public class FilmDao {
    private EntityManager em;
    
    public FilmDao(EntityManager em){
        this.em = em;
    }
    
    public void adaugaFilm(Film film){
        em.persist(film);
    }
    
    public List<Film> getFilme(){
        Query query = em.createQuery("SELECT f FROM filme f");
        return query.getResultList();
    }
}
