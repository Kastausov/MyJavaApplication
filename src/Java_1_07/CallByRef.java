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
public class CallByRef {
    public static void main(String[] args) {
        Test obj = new Test(15,20);
        System.out.println("a и b до вызова функции : " + obj.a + " и " + obj.b);
        obj.meth(obj);
        System.out.println("a и b после вызова функции : " + obj.a + " и " + obj.b);
    }
}
