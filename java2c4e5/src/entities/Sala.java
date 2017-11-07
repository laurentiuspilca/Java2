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
import javax.persistence.OneToMany;

/**
 *
 * @author student
 */
@Entity
public class Sala {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int numar;
    
    @OneToMany(mappedBy = "sala")
    private List<ProgramareFilm> programari;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public List<ProgramareFilm> getProgramari() {
        return programari;
    }

    public void setProgramari(List<ProgramareFilm> programari) {
        this.programari = programari;
    }
    
    
}
