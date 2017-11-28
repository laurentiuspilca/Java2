/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author student
 */
public class ServiceThread extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    
    public ServiceThread(Socket socket) throws Exception {
        this.socket = socket;
        this.in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        
        this.out = new PrintWriter(socket.getOutputStream(), true);
    }
    
    @Override
    public void run() {
        try {
            while(true) {
                String line = in.readLine();
                StringBuilder sb = new StringBuilder(line);
                out.println(sb.reverse());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
