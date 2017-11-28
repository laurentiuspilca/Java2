/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
        
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        
        PrintWriter out = 
                new PrintWriter(socket.getOutputStream(), true);
    
        int x = Integer.parseInt(in.readLine());
        int y = Integer.parseInt(in.readLine());
        
        out.println(x+y);
    }
    
}
