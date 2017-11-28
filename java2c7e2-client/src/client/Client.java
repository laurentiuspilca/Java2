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
        Socket socket = new Socket("localhost", 4444);
        
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        
        PrintWriter out = 
                new PrintWriter(socket.getOutputStream(), true);
    
        out.println(6);
        out.println(5);
        
        System.out.println(in.readLine());
    }
    
}
