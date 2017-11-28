/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import animale.Pisica;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author student
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4444);
        Socket socket = ss.accept();
        
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        
        Pisica p = (Pisica) in.readObject();
        
        System.out.println("Am primit pisica " + p.getNume() + " de culoare " + p.getCuloare());
    }
    
}
