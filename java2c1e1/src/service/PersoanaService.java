/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.PersoanaDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import manager.ConnectionFactory;
import manager.DBManager;
import model.Persoana;

/**
 *
 * @author student
 */
public class PersoanaService {
    
    public void adaugaPersoana(String nume) {
        Connection con = null;
        DBManager dbManager = ConnectionFactory.create(DBManager.Type.DRIVER);
        try {
            con = dbManager.getConnection();
         
            PersoanaDao persoanaDao = new PersoanaDao(con);
            
            Persoana p = new Persoana();
            p.setNume(nume);
            persoanaDao.adaugaPersoana(p);
            con.commit();
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PersoanaService.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(PersoanaService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbManager.closeConnection(con);
        }
    }
    
    public List<Persoana> getPersoane() {
        Connection con = null;
        DBManager dbManager = ConnectionFactory.create(DBManager.Type.DRIVER);
        try {
            con = dbManager.getConnection();
            PersoanaDao persoanaDao = new PersoanaDao(con);
            return persoanaDao.getPersoane();
        } catch (SQLException ex) {
            Logger.getLogger(PersoanaService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbManager.closeConnection(con);
        }
        
        return Collections.emptyList();
    }
}
