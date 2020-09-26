/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.B;
import MyInterface.A;

/**
 *
 * @author Dmitry
 */
public class NestedIFDemo 
{
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        
        if(nif.isNotNegative(10))
            System.out.println("10 не является отрицательным");
        if(nif.isNotNegative(-12))
            System.out.println("Это не будет отображаться");
    }
}
