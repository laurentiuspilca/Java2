/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import animale.Pisica;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author student
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 4444);
        
        try (ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
            Pisica p = new Pisica();
            p.setNume("Tom");
            p.setCuloare("negru");

            out.writeObject(p);
        }
    }
    
}
