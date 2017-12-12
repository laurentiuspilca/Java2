/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import ws.HelloService;

/**
 *
 * @author student
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/helloservice?wsdl";
        QName qName = new QName("http://ws/", "JaxWsHelloServiceService");
        
        Service service = Service.create(new URL(url), qName);
        
        HelloService helloService = 
                service.getPort(
                        new QName("http://ws/", "JaxWsHelloServicePort"), 
                        HelloService.class);
        
        String result = helloService.sayHello("John");
        System.out.println(result);
    }
    
}
