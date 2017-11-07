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
@Table(name="angajati")
public class Angajat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nume;
    
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="date1", 
                           column = @Column(name = "data_angajare")),
        @AttributeOverride(name="date2", 
                           column = @Column(name = "data_demisie"))
    })
    private Perioada contract;

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

    public Perioada getContract() {
        return contract;
    }

    public void setContract(Perioada contract) {
        this.contract = contract;
    }
    
    
}






