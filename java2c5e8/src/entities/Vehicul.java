/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author student
 */
@Entity
public class Vehicul {
    
    @EmbeddedId
    private NrAuto numar;
    
    private String culoare;

    public NrAuto getNumar() {
        return numar;
    }

    public void setNumar(NrAuto numar) {
        this.numar = numar;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    
}
