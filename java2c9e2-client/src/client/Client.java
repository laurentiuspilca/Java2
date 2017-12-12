/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import ws.ReverseStringService;

/**
 *
 * @author student
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/reversestring?wsdl";
        
        QName serviceName = new QName("http://ws/", "JaxWsReverseStringServiceService");
        QName portName = new QName("http://ws/", "JaxWsReverseStringServicePort");
        
        Service service = Service.create(new URL(url), serviceName);
        
        ReverseStringService s = service.getPort(portName, ReverseStringService.class);
    
        System.out.println(s.reverseString("Hello World!"));
    }
    
}
