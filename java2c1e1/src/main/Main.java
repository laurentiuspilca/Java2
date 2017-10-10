/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import service.PersoanaService;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersoanaService service = new PersoanaService();
//        service.adaugaPersoana("Gigel");
        service.getPersoane().forEach(System.out::println);
    }
    
}
