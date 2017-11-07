/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.eclipse.persistence.jpa.config.Cascade;

/**
 *
 * @author student
 */
@Entity
@Table(name="persoane")
public class Persoana {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    private String nume;
    
    @OneToOne(cascade = CascadeType.ALL)
    private CarteIdentitate carteIdentitate;

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

    public CarteIdentitate getCarteIdentitate() {
        return carteIdentitate;
    }

    public void setCarteIdentitate(CarteIdentitate carteIdentitate) {
        this.carteIdentitate = carteIdentitate;
    }
    
    
}





