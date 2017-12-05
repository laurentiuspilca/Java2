/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.Suma;

/**
 *
 * @author student
 */
public class ConnectionController {
    
    private Registry registry;
    private Suma suma;
    
    private ConnectionController() {
        try {
            registry = LocateRegistry.getRegistry("localhost", 4444);
            suma = (Suma) registry.lookup("server");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ConnectionController SINGLETON = new ConnectionController();
    }
    
    public static ConnectionController getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public int suma(int a, int b) throws RemoteException {
        return suma.suma(a, b);
    }
}
