/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author student
 */
@Entity
public class Film {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String titlu;
    
    @ManyToMany(mappedBy = "filme")
    private List<Actor> actori;
    
    @ManyToOne
    private Regizor regizor;
    
    @OneToMany(mappedBy = "film")
    private List<ProgramareFilm> programari;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public List<Actor> getActori() {
        return actori;
    }

    public void setActori(List<Actor> actori) {
        this.actori = actori;
    }

    public Regizor getRegizor() {
        return regizor;
    }

    public void setRegizor(Regizor regizor) {
        this.regizor = regizor;
    }

    public List<ProgramareFilm> getProgramari() {
        return programari;
    }

    public void setProgramari(List<ProgramareFilm> programari) {
        this.programari = programari;
    }
    
    
}
