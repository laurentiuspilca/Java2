/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Produs;
import service.ProdusService;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ProdusService.getInstance().creazaZeceProduse();
//        Produs p = new Produs();
//        p.setId(6);
//        ProdusService.getInstance().stergeProdus(p);
//        ProdusService.getInstance().modificaProdus(8, "ALT PRODUS", 100
        
        ProdusService.getInstance().getAll().forEach(System.out::println);
    }
    
}
