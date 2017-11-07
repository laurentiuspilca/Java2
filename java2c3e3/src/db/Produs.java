/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import db.embeddables.Perioada;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author student
 */
@Entity
@Table(name = "produse")
public class Produs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String denumire;
    
    @Embedded
     @AttributeOverrides({
        @AttributeOverride(name="date1", 
                           column = @Column(name = "data_productie")),
        @AttributeOverride(name="date2", 
                           column = @Column(name = "data_expirare"))
    })
    private Perioada valabilitate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Perioada getValabilitate() {
        return valabilitate;
    }

    public void setValabilitate(Perioada valabilitate) {
        this.valabilitate = valabilitate;
    }
    
    
}
