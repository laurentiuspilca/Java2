/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author student
 */
public interface DBManager {
    public Connection getConnection() throws SQLException;
    public void closeConnection(Connection con);

    public static enum Type {
        DRIVER, POOL
    }
}
