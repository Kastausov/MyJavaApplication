/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGenerics;

/**
 *
 * @author Dmitry
 */
public class NonGenDemo {
     public static void main(String[] args) {
        
        NoneGen iOb = new NoneGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();
    
        NoneGen strOb = new NoneGen("Тест без обобщений");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);
        System.out.println();
        iOb = strOb;
        v = (Integer) iOb.getOb();// Ошибка!!!
    }
}
