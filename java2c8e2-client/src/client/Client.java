/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import controller.ConnectionController;
import java.rmi.RemoteException;

/**
 *
 * @author student
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        int res = ConnectionController.getInstance().suma(5, 6);
        System.out.println(res);
    }
    
}