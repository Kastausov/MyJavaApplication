/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_10.MyTrowable;

/**
 *
 * @author Dmitry
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Внутри throwOne.");
        throw new IllegalAccessException("demo");        
    }
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено " + e);
        }
    }
}
