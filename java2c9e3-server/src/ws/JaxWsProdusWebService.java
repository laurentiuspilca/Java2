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
import service.ProdusService;

/**
 *
 * @author student
 */
@WebService
public class JaxWsProdusWebService implements ProdusWebService {

    @Override
    @WebMethod
    public void adaugaProdus(@WebParam Produs p) {
        ProdusService.getInstance().adaugaProdus(p);
    }

    @Override
    @WebMethod
    public List<Produs> getProduse() {
        return ProdusService.getInstance().getProduse();
    }

    @Override
    @WebMethod
    public void stergeProdus(@WebParam Produs p) {
        ProdusService.getInstance().stergeProdus(p);
    }
    
}
