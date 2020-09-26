/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyShell;

/**
 *
 * @author Dmitry
 */
public class AutoBox3 {
    public static void main(String[] args) {
        
        Integer iOb, iOb2;
        int i;
        
        iOb = 100;
        System.out.println("Исходное значение iOb: " + iOb);
        
        ++iOb;
        System.out.println("После ++iOb: " + iOb);
        
        iOb2 = iOb + (iOb/3);
        System.out.println("После выражения: " + iOb2);
        
        i = iOb + (iOb/3);
        System.out.println("i после выражения: " + i);
               
    }
}
