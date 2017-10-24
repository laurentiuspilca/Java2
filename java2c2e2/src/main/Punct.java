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
    
    
    private int x;
    private int y;
    
    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void afisareXY() {
        System.out.println("Afisare xy " + x + " " +y);
    }
    
    @Apeleaza
    public void afisareYX() {
        System.out.println("Afisare yx " + y + " " +x);
    }
}
