/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Persoana;

/**
 *
 * @author student
 */
public class PersoanaDao {
    
    private Connection con;
    
    public PersoanaDao(Connection con) {
        this.con = con;
    }
    
    public void adaugaPersoana(Persoana p) throws SQLException {
        String sql = "INSERT INTO persoane VALUES (NULL, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, p.getNume());
            stmt.executeUpdate();
        }
    }
    
    public List<Persoana> getPersoane() throws SQLException {
        List<Persoana> list = new ArrayList<>();
        String sql = "SELECT * FROM persoane";
        
        try (
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
            ) {
            
            while (rs.next()) {
                Persoana p = new Persoana();
                p.setId(rs.getInt(1));
                p.setNume(rs.getString(2));
                list.add(p);
            }
            
        }
        
        return list;
    }
}
