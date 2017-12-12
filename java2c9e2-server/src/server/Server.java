/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.xml.ws.Endpoint;
import ws.JaxWsReverseStringService;

/**
 *
 * @author student
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "http://localhost:8080/reversestring";
        Endpoint.publish(url, new JaxWsReverseStringService());
    }
    
}
