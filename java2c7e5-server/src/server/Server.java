/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author student
 */
public class Server {

    private static List<ServiceThread> clients = new ArrayList<>();
    private static ReadWriteLock lock = new ReentrantReadWriteLock();
    
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4444);
        
        while (true) {
            Socket socket = ss.accept();
            ServiceThread st = new ServiceThread(socket);
            st.start();
            try {
                lock.writeLock().lock();
                clients.add(st);
            } finally {
                lock.writeLock().unlock();
            }
        }
    }
    
    public static void sendMessageToAll(String message) {
        try {
            lock.readLock().lock();
            clients.forEach(c -> c.sendMessage(message));
        } finally {
            lock.readLock().unlock();
        }
    }
}
