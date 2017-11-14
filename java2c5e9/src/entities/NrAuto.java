/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author student
 */
public class NrAuto implements Serializable {
    
    private String judet;
    private int numar;
    private String cod;

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.judet);
        hash = 89 * hash + this.numar;
        hash = 89 * hash + Objects.hashCode(this.cod);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NrAuto other = (NrAuto) obj;
        if (!Objects.equals(this.judet, other.judet)) {
            return false;
        }
        if (this.numar != other.numar) {
            return false;
        }
        if (!Objects.equals(this.cod, other.cod)) {
            return false;
        }
        return true;
    }
    
    
}
