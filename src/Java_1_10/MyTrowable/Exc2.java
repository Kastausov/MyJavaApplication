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
public class Exc2 {
    public static void main(String[] args) {
        int d,a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет напечатано.");
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль!");
        }
        System.out.println("После оператора catch.");
    }
}
