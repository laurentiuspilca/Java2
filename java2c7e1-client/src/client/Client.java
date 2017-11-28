/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
        String host = "localhost";
        int port = 4444;
        
        Socket socket = new Socket(host, port);
        
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        
        PrintWriter out = 
                new PrintWriter(socket.getOutputStream(), true);
        
        out.println("HELLO WORLD!");
        String result = in.readLine();
        
        System.out.println(result);
    }
    
}
