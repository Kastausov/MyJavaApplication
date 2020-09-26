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
public class Meta {
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден!");
        }
    }
    @MyAnno(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i){
        Meta ob = new Meta();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден!");
        }
    }
    public static void main(String[] args) {
        myMeth();
        myMeth("тест",10);
    }
}
