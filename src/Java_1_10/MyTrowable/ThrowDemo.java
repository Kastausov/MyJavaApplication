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
public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Перехвачено внутри demoproc: " + e);
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
