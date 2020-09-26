/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyAnno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author Dmitry
 */
@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {
    @What(description = "Аннотация тестового метода")
    @MyAnno(str = "myMeth", val = 100)
    public static void myMeth(){
        Meta2 ob = new Meta2();
        try {
            Class c = ob.getClass();
            
            Annotation annos[] = c.getAnnotations();
            for(Annotation a : annos)
                System.out.println(a);
            
            System.out.println();
            
            Method m = c.getMethod("myMeth");
            annos = m.getAnnotations();
            for(Annotation a : annos)
                System.out.println(a);
            
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден!");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
