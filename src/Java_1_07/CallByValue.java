/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

/**
 *
 * @author Dmitry
 */
public class CallByValue {
    public static void main(String[] args) {
        Test obj = new Test();
        int a=15,b=20;
        System.out.println("a и b до вызова функции : " + a + " и " + b);
        obj.meth(a, b);
        System.out.println("a и b после вызова функции : " + a + " и " + b);
    }
}
