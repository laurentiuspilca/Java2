/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import model.Produs;

/**
 *
 * @author student
 */
public interface ProdusWebService {
    public void adaugaProdus(Produs p);
    public List<Produs> getProduse();
    public void stergeProdus(Produs p);
}
