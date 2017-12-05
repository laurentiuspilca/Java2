/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.Login;

/**
 *
 * @author student
 */
public class ConnectionController {
    
    private Registry registry;
    private Login login;
    
    private ConnectionController() {
        try {
            registry = LocateRegistry.getRegistry("localhost", 4444);
            login = (Login) registry.lookup("server");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ConnectionController SINGELTON = new ConnectionController();
    }
    
    public static ConnectionController getInstance() {
        return SingletonHolder.SINGELTON;
    }
    
    public boolean register(String username, String password) throws RemoteException {
        return login.register(username, password);
    }
    
    public boolean login(String username, String password) throws RemoteException {
        return login.login(username, password);
    }
}
