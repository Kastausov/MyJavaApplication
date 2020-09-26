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
public class ChainExcDemo 
{
    static void demoproc(){
        NullPointerException e = new NullPointerException("Верхний уровень");
        e.initCause(new ArithmeticException("Деление на ноль!"));
        throw e;
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("причина ошибки: " + e.getCause());
        }
    }
}
