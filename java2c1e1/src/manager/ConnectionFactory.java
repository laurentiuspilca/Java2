/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author student
 */
public final class ConnectionFactory {
    
    public static DBManager create(DBManager.Type type) {
        switch (type) {
            case DRIVER:
                return new DBDriverManager();
            case POOL:
                return new DBPoolConnectionManager();
            default:
                throw new IllegalArgumentException();
        }
    }
}
