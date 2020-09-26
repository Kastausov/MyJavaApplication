/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_10.MyTrowable;

import Java_1_10.MyTrowable.MyException;

/**
 *
 * @author Dmitry
 */
public class ExceptionDemo 
{
static void compute(int a) throws MyException{
    System.out.println("Вызван compute[" + a + "]");
    if(a>10)throw new MyException(a);
    System.out.println("Нормальное завершение compute.");
}
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено " + e);
        }
    }
}
