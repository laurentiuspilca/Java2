/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import db.CarteIdentitate;
import db.Persoana;
import javax.persistence.EntityManagerFactory;
import service.MainService;

/**
 *
 * @author student
 */
public class Main {

    
    public static void main(String[] args) {
        MainService mainService = MainService.getInstance();
        
        Persoana persoana = new Persoana();
        persoana.setNume("John");
        
        CarteIdentitate carteIdentitate = new CarteIdentitate();
        carteIdentitate.setSerie("BV");
        carteIdentitate.setNumar("123456");
        
        persoana.setCarteIdentitate(carteIdentitate);
        carteIdentitate.setPersoana(persoana);
        
        mainService.adaugaCarteIdentitate(carteIdentitate);
        
                
    }
    
}
