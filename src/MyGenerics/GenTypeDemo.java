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
public class GenTypeDemo {
    public static void main(String[] args) {
        
      Gen<Integer> iOb = new Gen<Integer>(88);
      Gen<Float> fOb = new Gen<Float>(88.8F);
      
      System.out.println(iOb.getClass().getName());
      System.out.println(fOb.getClass().getName());
    }
}
