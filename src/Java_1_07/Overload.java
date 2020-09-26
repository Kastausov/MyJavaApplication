/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

import Java_1_07.OverloadDemo;

/**
 *
 * @author Dmitry
 */
public class Overload {
    public static void main(String[] args) {
        
        OverloadDemo ob = new OverloadDemo();
        double result;
        
        int i = 88;
                
        ob.test();
        ob.test(10);
        ob.test(i);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат ob.test(123.25): " + result);

    }
}
