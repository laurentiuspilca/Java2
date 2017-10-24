/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.Field;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Punct p = new Punct();
        
        Class<?> punctClass = Class.forName("main.Punct");
        
        Field[] fields = punctClass.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.isAnnotationPresent(Atribuie.class)) {
                Atribuie a = f.getDeclaredAnnotation(Atribuie.class);
                int value = a.value();
                f.setInt(p, value);
            }
        }
        
        p.afisareXYZ();
    }
    
}
