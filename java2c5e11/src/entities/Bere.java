/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;

/**
 *
 * @author student
 */
@Entity
public class Bere extends Produs {
    
    private double pa;

    public double getPa() {
        return pa;
    }

    public void setPa(double pa) {
        this.pa = pa;
    }
    
    
}
