/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import model.Produs;
import ws.ProdusWebService;

/**
 *
 * @author student
 */
public class ProdusWebServiceController {
    
    private ProdusWebService service;
    
    private ProdusWebServiceController() {
        try {
            URL url = new URL("http://localhost:8080/produsservice?wsdl");
            
            QName serviceName = new QName("http://ws/", "JaxWsProdusWebServiceService");
            QName portName = new QName("http://ws/", "JaxWsProdusWebServicePort");
        
            Service s = Service.create(url, serviceName);
            
            service = s.getPort(portName, ProdusWebService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ProdusWebServiceController SINGLETON = new ProdusWebServiceController();
    }
    
    public static ProdusWebServiceController getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaProdus(Produs p) {
        service.adaugaProdus(p);
    }
    
    public List<Produs> getProduse() {
        return service.getProduse();
    }
    
    public void stergeProdus(Produs p) {
        service.stergeProdus(p);
    }
}
