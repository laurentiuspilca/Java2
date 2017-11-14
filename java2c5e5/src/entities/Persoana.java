/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyTemporal;
import javax.persistence.TemporalType;

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
    
    @ElementCollection
    @MapKeyTemporal(TemporalType.TIMESTAMP)
    private Map<Date, String> evenimente;

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

    public Map<Date, String> getEvenimente() {
        return evenimente;
    }

    public void setEvenimente(Map<Date, String> evenimente) {
        this.evenimente = evenimente;
    }
    
    
}
