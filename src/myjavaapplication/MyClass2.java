/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaapplication;

/**
 *
 * @author Dmitry
 */
public class MyClass2 {
    public static void main(String[] args) {
        byte a = 40;
        byte b =50;
        byte c = 100;
        int d = a+b/c;
    
        System.out.println("d = " + d);
        
        b = (byte)(b*2);
        System.out.println("b = " + b);
    }
    
}
