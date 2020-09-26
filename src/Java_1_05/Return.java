/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_05;

/**
 *
 * @author Dmitry
 */
public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До выполнения возврата.");
        if(t) return;
        System.out.println("Этот оператор выполняться не будет.");
    }
}
