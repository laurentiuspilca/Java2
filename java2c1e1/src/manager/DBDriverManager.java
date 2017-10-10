/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class DBDriverManager implements DBManager {
    
    private String url;
    private String user;
    private String pass;
    
    public DBDriverManager() {
        this.url = "jdbc:mysql://localhost/java2curs1";
        this.user = "root";
        this.pass = "";
    }
    
    @Override
    public Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(url, user, pass);
        con.setAutoCommit(false);
        return con;
    }
    
    @Override
    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBDriverManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
