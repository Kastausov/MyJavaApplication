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
public class MyClass5 {
    public static void main(String[] args) {
        int denom, num;
        int x,y,z;
        x=y=z=100;
        
        
        denom = 5;
        num   = 100;  
        if (denom != 0 && num / denom > 10)
            System.out.println("num / denom = " + num / denom);
        else System.out.println("denom = " + denom);
        
    }
}
