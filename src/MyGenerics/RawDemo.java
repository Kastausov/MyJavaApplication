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
public class RawDemo {
    public static void main(String[] args) {
        
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<String>("Обобщёный тест");
        
        Gen raw = new Gen(new Double(98.6));
        
        double d = (Double) raw.getOb();
        System.out.println("Значение: " + d);
        
    }
}
