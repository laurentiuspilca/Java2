/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.Method;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Punct p = new Punct(10,20);
        
        Class<?> classPunct = Class.forName("main.Punct");
        
        Method[] methods = classPunct.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Apeleaza.class)) {
                m.invoke(p);
            }
        }
    }
    
}
