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
import rmi.Hello;

/**
 *
 * @author student
 */
public class HelloService extends UnicastRemoteObject implements Hello {
    
    private Registry registry;
    
    public HelloService() throws RemoteException {
        registry = LocateRegistry.createRegistry(4444);
        registry.rebind("server", this);
    }
    
    @Override
    public String sayHello(String nume) {
        return "Hello, " + nume + "!";
    }
}
