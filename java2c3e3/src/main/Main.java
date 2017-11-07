/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import db.Angajat;
import db.Produs;
import db.embeddables.Perioada;
import java.sql.Date;
import java.time.LocalDate;
import service.MainService;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainService mainService = MainService.getInstance();
       
        Perioada perioada = new Perioada();
        perioada.setDate1(Date.valueOf(LocalDate.of(2016, 06, 20)));
        perioada.setDate2(Date.valueOf(LocalDate.of(2018, 01, 10)));
        
        Angajat a = new Angajat();
        a.setNume("John");
        a.setContract(perioada);
        
        Produs p = new Produs();
        p.setDenumire("Ciocolata Ritter");
        p.setValabilitate(perioada);
        
        mainService.adaugaAngajat(a);
        mainService.adaugaProdus(p);
        
        
    }
    
}
