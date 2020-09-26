/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_03;

/**
 *
 * @author Dmitry
 */
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        
        System.out.println("\nПреобразование int в byte.");
        b = (byte) i;
        System.out.println("i и b " + i + " " + b);
   
        System.out.println("\nПреобразование double в int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);
   
        System.out.println("\nПреобразование double в byte.");
        b = (byte) d;
        System.out.println("d и b " + d + " " + b);
   }
    
}
