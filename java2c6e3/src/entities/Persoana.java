/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author student
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Persoana.findAll", query = "SELECT p FROM Persoana p"),
    @NamedQuery(name = "Persoana.findByNume", query = "SELECT p FROM Persoana p WHERE p.nume = :nume")
})
public class Persoana {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nume;

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

    @Override
    public String toString() {
        return "Persoana{" + "id=" + id + ", nume=" + nume + '}';
    }
    
    
}
