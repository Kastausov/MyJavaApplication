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
public class SimpGen {
    public static void main(String[] args) {
        
        TwoGen<Integer,String> tgObj = new TwoGen<Integer,String>(88,"Обобщения");
        tgObj.showTypes();
        
        System.out.println();
        
        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);
        
        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
