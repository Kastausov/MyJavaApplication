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
public class Single {
    @MySingle(100)
    public static void myMeth(){
        Single ob = new Single();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден!");
        }
    }
    @SomeAnno(19)
    public static void myMeth(String str, int i){
        Single ob = new Single();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            SomeAnno anno = m.getAnnotation(SomeAnno.class);
            System.out.println(anno.xyz() + " " + anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден!");
        }
    }
    public static void main(String[] args) {
        myMeth();
        myMeth("тест",10);
    }    
}
