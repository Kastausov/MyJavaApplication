/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

import Java_1_07.Test;

/**
 *
 * @author Dmitry
 */
public class AccessTest {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.a = 10;
        obj.b = 20;
        //obj.c = 100;
        obj.setC(100);
        System.out.println("a, b , c : " + obj.a + ", " + obj.b + ", " + obj.getC());
    }
}
