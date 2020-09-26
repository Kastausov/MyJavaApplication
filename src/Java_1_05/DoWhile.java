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
public class DoWhile {
    public static void main(String[] args) {
        int n = 11;
        do {
            System.out.println("Такт " + n);
            //n--;
        }while(--n>10);
    }
}
