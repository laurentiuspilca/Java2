/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

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
        
        while (true) {
            Socket socket = ss.accept();
            new ServiceThread(socket).start();
        }
    }
    
}
