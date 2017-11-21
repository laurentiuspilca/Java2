/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.CascadeType;
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
public class Persoana {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nume;
    
    @OneToMany(mappedBy = "persoana", cascade = CascadeType.ALL)
    private List<Masina> masini;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Masina> getMasini() {
        return masini;
    }

    public void setMasini(List<Masina> masini) {
        this.masini = masini;
    }

    @Override
    public String toString() {
        return "Persoana{" + "id=" + id + ", nume=" + nume + '}';
    }
    
    
}
