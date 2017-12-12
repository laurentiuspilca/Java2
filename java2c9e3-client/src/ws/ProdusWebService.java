/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import model.Produs;

/**
 *
 * @author student
 */
@WebService
public interface ProdusWebService {
    
    @WebMethod
    public void adaugaProdus(@WebParam Produs p);
    
    @WebMethod
    public List<Produs> getProduse();
    
    @WebMethod
    public void stergeProdus(@WebParam Produs p);
}
