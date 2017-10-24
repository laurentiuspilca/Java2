/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class<?> punctClass = Class.forName("main.Punct");
            Constructor<?> constructor = 
                    punctClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            Punct p1 = (Punct) constructor.newInstance();
            
            System.out.println(p1);
            
            Field fx = punctClass.getDeclaredField("x");
            fx.setAccessible(true);
            fx.setInt(p1, 10);
            
            Field fy = punctClass.getDeclaredField("y");
            fy.setAccessible(true);
            fy.setInt(p1, 30);
            
            Method m = punctClass.getDeclaredMethod("afisareXY");
            m.setAccessible(true);
            m.invoke(p1);
            
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
