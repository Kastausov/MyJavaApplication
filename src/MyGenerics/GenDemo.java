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
public class GenDemo {
    public static void main(String[] args) {
        
        Gen<Integer> iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();
    
        Gen<String> strOb = new Gen<String>("Обобщёный тест");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
        System.out.println();
    }
}
