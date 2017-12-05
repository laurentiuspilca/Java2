/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import rmi.Suma;

/**
 *
 * @author student
 */
public class SumService extends UnicastRemoteObject implements Suma{

    private Registry registry;
    
    public SumService() throws RemoteException {
        registry = LocateRegistry.createRegistry(4444);
        registry.rebind("server", this);
    }
    
    @Override
    public int suma(int a, int b) {
        return a+b;
    }
    
} 
