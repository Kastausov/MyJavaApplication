/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyAnno;

import java.lang.reflect.Method;

/**
 *
 * @author Dmitry
 */
public class Marker {
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("myMeth");
            if(m.isAnnotationPresent(MyMarker.class))
                    System.out.println("MyMarker присутствует");
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден!");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }     
}
