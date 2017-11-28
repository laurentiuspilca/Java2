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
        System.out.println("Se deschide portul 4444");
        ServerSocket ss = new ServerSocket(4444);
        System.out.println("Portul 4444 a fost deschis.");
        System.out.println("Asteptam clientul sa se conecteze");
        Socket socket = ss.accept();
        System.out.println("Clientul s-a conectat");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        
        PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);
        
        System.out.println("Asteptam date de le client");
        String line = in.readLine();
        System.out.println("Am primit de la client " + line);
        StringBuilder sb = new StringBuilder(line);
        sb.reverse();
        System.out.println("Trimitem inapoi catre client " + sb);
        out.println(sb.toString());
        System.out.println("Serverul se inchide");
    }
    
}
