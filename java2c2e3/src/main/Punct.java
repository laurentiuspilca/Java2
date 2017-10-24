/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author student
 */
public class Punct {
    
    @Atribuie(10)
    private int x;
    
    @Atribuie(value = 20)
    private int y;
    
    @Atribuie
    private int z;
    
    public Punct() {
        
    }
    
    public void afisareXYZ() {
        System.out.println(x + " " + y + " " + z);
    }
}
