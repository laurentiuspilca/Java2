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
public class ConnectionController {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    
    private ConnectionController() {
        try {
            socket = new Socket("localhost", 4444);
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ConnectionController SINGLETON = new ConnectionController();
    }
    
    public static ConnectionController getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void sendMessage(String message) {
        out.println(message);
    }
    
    public String readMessage() {
        try {
            return in.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
